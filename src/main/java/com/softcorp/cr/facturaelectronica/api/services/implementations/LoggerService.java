/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.services.implementations;

import com.softcorp.cr.facturaelectronica.api.services.declarations.ILoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
@Configuration
@ComponentScan("com.softcorp.cr.facturaelectronica.api.services.implementations")
public class LoggerService implements ILoggerService {
    private final String logURL = "http://logs-01.loggly.com/inputs/5b6aa91c-8a3f-4949-97e0-6facebfc9091/tag/http/";


    RestTemplate restTemplate = new RestTemplate();

    @Override
    public void error(Object object) {
        Object logObject = new Object() {
            public Object infoObject = object;
            public String type = "ERROR";
        };
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Object> entity = new HttpEntity<Object>(logObject, headers);
        restTemplate.exchange(logURL, HttpMethod.POST, entity, String.class).getBody();
    }

    @Override
    public void info(Object object) throws IOException {
        try {
            Object logObject = new Object() {
                public Object infoObject = object;
                public String type = "INFO";
            };
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<Object> entity = new HttpEntity<Object>(logObject, headers);
            restTemplate.exchange(logURL, HttpMethod.POST, entity, String.class).getBody();
        }catch (Exception e){
            String message = e.getMessage();
        }
    }
}
