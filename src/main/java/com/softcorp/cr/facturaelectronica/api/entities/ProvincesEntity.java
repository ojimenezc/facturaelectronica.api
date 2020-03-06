

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "provinces", schema = "facturaelectronica")
@Entity
public class ProvincesEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty("name")
    @Column(name = "province_name")
    private String name;

    @JsonProperty("countryId")
    @Column(name = "country_id")
    private int countryId;

    @JsonProperty("code")
    @Column(name = "code")
    private int code;
}

