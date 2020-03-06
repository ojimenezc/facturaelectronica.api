/*
 * Copyright (c) 2020.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softcorp.cr.facturaelectronica.api.dtos.ClientIDPLoginDTO;
import com.softcorp.cr.facturaelectronica.api.dtos.CreateIDPUserRequestDTO;
import com.softcorp.cr.facturaelectronica.api.dtos.RestClientResponse;
import com.softcorp.cr.facturaelectronica.api.helpers.interfaces.IRestClient;
import com.softcorp.cr.facturaelectronica.api.services.implementations.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

@Component
public class UsersHelper {
    @Autowired
    LoggerService loggerService;
    @Value("${users.create.endpoint}")
    private String createUserEndpoint;

    @Value("${softcorp.idp.auth.url}")
    private String authenticateEndpoint;

    public Boolean createUserInIDP(CreateIDPUserRequestDTO request, String authenticatedToken) throws JsonProcessingException {
        try {
            String[] parts = authenticatedToken.split(" ");
            if (parts.length == 0) {
                loggerService.error("Invalid token when creating user in IDP");
                throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "Invalid token when creating user in IDP");
            }
            IRestClient client = new RestClient(parts[1]);
            RestClientResponse response = client.post(createUserEndpoint, request);
            return true;
        } catch (HttpServerErrorException se) {
            loggerService.error("User was not created in IDP. JSON = " + se.getResponseBodyAsString());
            throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, se.getResponseBodyAsString());
        } catch (Exception e) {
            loggerService.error("User was not created in IDP. JSON = " + new ObjectMapper().writeValueAsString(request));
            loggerService.error(e);
            return false;
        }
    }

    public Object loginClientInIDP(ClientIDPLoginDTO clientIDPLoginDTO) throws JsonProcessingException {
        try {
            IRestClient client = new RestClient("");
            RestClientResponse response = client.post(authenticateEndpoint, clientIDPLoginDTO);
            loggerService.info("User " + clientIDPLoginDTO.getUsername() + " logged in " + response.getBody());
            return response.getBody();
        } catch (Exception e) {
            loggerService.error("User was not created in IDP. JSON = " + new ObjectMapper().writeValueAsString(clientIDPLoginDTO));
            loggerService.error(e);
            return false;
        }
    }
}
