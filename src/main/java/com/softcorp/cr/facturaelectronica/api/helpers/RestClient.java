/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.softcorp.cr.facturaelectronica.api.dtos.RestClientResponse;
import com.softcorp.cr.facturaelectronica.api.helpers.interfaces.IRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class RestClient implements IRestClient {

    private static final Logger log = LoggerFactory.getLogger(RestClient.class);
    private HttpStatus status;
    private RestTemplate restTemplate = null;
    private HttpHeaders headers = null;
    HttpEntity entity = null;

    public RestClient(String token) {
        HttpComponentsClientHttpRequestFactory factory =
                new HttpComponentsClientHttpRequestFactory();

        factory.setConnectTimeout(5000);
        factory.setReadTimeout(10000);

        restTemplate = new RestTemplate(factory);

        headers = new HttpHeaders();
        headers.set("User-Agent", "Mozilla/5.0 Firefox/26.0");
        headers.set("Authorization", "Bearer " + token);
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
    }

    @Override
    public void setRest(RestTemplate rest) {
        this.restTemplate = rest;
    }


    @Override
    public RestClientResponse get(String endpoint, Object body) {

        entity = new HttpEntity(body, headers);
        HttpEntity<?> response = restTemplate.exchange(endpoint,
                HttpMethod.GET,
                entity, String.class);

        RestClientResponse restClientResponse = new RestClientResponse();
        restClientResponse.setHeaders(response.getHeaders());
        restClientResponse.setBody(response.getBody());
        return restClientResponse;
    }

    @Override
    public void delete(String endpoint) {

        restTemplate.delete(endpoint, headers);
    }

    @Override
    public void delete(String endpoint, Object request) {

        restTemplate.delete(endpoint, request, headers);
    }


    @Override
    public RestClientResponse post(String endpoint, Object request) throws JsonProcessingException {

        entity = new HttpEntity(request, headers);
        HttpEntity<?> response = restTemplate.exchange(endpoint,
                HttpMethod.POST,
                entity, String.class);

        RestClientResponse restClientResponse = new RestClientResponse();
        restClientResponse.setHeaders(response.getHeaders());
        restClientResponse.setBody(response.getBody());
        return restClientResponse;
    }

    @Override
    public void put(String endpoint, Object request) {

        restTemplate.put(endpoint, request);
    }

    @Override
    public void setStatus(HttpStatus status) {

        this.status = status;
    }
}

