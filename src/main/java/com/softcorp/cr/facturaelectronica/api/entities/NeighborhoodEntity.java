/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "neighborhoods", schema = "facturaelectronica")
@Entity
public class NeighborhoodEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty("name")
    @Column(name = "neighborhood_name")
    private String name;

    @JsonProperty("districtId")
    @Column(name = "district_id")
    private int districtId;

    @JsonProperty("code")
    @Column(name = "neighborhood_code")
    private String code;
}

