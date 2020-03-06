/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.services.implementations;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softcorp.cr.facturaelectronica.api.dtos.HaciendaTokenResponse;
import com.softcorp.cr.facturaelectronica.api.helpers.TokenHelper;
import com.softcorp.cr.facturaelectronica.api.services.declarations.ITokenService;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.softcorp.cr.facturaelectronica.api.services.implementations")
public class TokenService implements ITokenService {

    @Value("${idp.hacienda.uri}")
    private String idpUri;
    @Value("${idp.hacienda.client.id}")
    private String idpClientId;

    @Override
    public String getTokenFromHacienda(String user, String password) {
        try {


            String currentToken = TokenHelper.getToken();
            if (null != currentToken && !currentToken.isEmpty()) {
                return currentToken;
            }

            List<BasicNameValuePair> formparams = new ArrayList<>();
            formparams.add(new BasicNameValuePair("grant_type", "password"));
            formparams.add(new BasicNameValuePair("username", user));
            formparams.add(new BasicNameValuePair("password", password));
            formparams.add(new BasicNameValuePair("client_id", idpClientId));
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);
            HttpPost httppost = new HttpPost(idpUri + "/token");
            httppost.setEntity(entity);
            CloseableHttpClient httpclient = HttpClients.createDefault();

            String responseBody = httpclient.execute(httppost, httpResponse -> {
                int status = httpResponse.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity httpEntity = httpResponse.getEntity();
                    return httpEntity != null ? EntityUtils.toString(httpEntity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            });

            HaciendaTokenResponse haciendaTokenResponse = new ObjectMapper()
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readValue(responseBody, HaciendaTokenResponse.class);
            if (null != haciendaTokenResponse) {
                TokenHelper.setToken(haciendaTokenResponse.getAccess_token());
                TokenHelper.setExpirationDate(Instant.now().plusMillis(haciendaTokenResponse.getExpires_in() - 10));
                return haciendaTokenResponse.getAccess_token();
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
