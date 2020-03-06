/*
 * Copyright (c) 2020.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateIDPUserRequestDTO {
    @JsonProperty("name")
    private String Name;
    @JsonProperty("email")
    private String Email;
    @JsonProperty("password")
    private String Password;

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
