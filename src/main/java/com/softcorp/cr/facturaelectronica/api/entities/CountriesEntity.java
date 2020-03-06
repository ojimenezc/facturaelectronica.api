/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "countries", schema = "facturaelectronica")
@Entity
public class CountriesEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;
    @JsonProperty("name")
    @Column(name = "country_name")
    private String name;
    @JsonProperty("code")
    @Column(name = "country_code")
    private int code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
