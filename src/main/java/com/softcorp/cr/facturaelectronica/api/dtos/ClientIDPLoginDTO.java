/*
 * Copyright (c) 2020.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientIDPLoginDTO {
    @JsonProperty("userName")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("grant_type")
    private String grantType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
}
