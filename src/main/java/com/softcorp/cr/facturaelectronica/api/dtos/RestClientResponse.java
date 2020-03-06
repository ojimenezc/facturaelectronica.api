

package com.softcorp.cr.facturaelectronica.api.dtos;

import org.springframework.http.HttpHeaders;

public class RestClientResponse {
    private HttpHeaders headers;
    private Object body;

    public HttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(HttpHeaders headers) {
        this.headers = headers;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
