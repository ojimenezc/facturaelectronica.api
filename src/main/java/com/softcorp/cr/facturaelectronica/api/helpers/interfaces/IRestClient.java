

package com.softcorp.cr.facturaelectronica.api.helpers.interfaces;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.softcorp.cr.facturaelectronica.api.dtos.RestClientResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;

public interface IRestClient {
    void setRest(RestTemplate rest);

    RestClientResponse get(String endpoint, Object body);

    void delete(String endpoint);

    void delete(String endpoint, Object request);

    <T> T post(String endpoint, Object request) throws JsonProcessingException;

    void put(String endpoint, Object request);

    void setStatus(HttpStatus status);
}
