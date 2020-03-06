/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.services.implementations;

import com.softcorp.cr.facturaelectronica.api.security.IDPUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestService {

    @Value("${softcorp.idp.authenticate.url}")
    private String idpUrl;

    public IDPUser ValidateToken(String token) {
        try {
            String url = idpUrl + "?access_token=" + token;
            RestTemplate restTemplate = new RestTemplate();
            IDPUser result = restTemplate.getForObject(url, IDPUser.class);
            return result;
        } catch (Exception e) {
            throw e;
        }
    }

}
