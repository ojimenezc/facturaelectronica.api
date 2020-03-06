/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "districts", schema = "facturaelectronica")
@Entity
public class DistrictEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty("name")
    @Column(name = "district_name")
    private String name;

    @JsonProperty("countyId")
    @Column(name = "county_id")
    private int countyId;

    @JsonProperty("provinceId")
    @Column(name = "province_code")
    private int provinceId;

    @JsonProperty("code")
    @Column(name = "district_code")
    private int code;
}

