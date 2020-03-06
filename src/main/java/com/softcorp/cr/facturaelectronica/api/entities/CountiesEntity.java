

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "counties", schema = "facturaelectronica")
@Entity
public class CountiesEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty("name")
    @Column(name = "county_name")
    private String name;

    @JsonProperty("provinceId")
    @Column(name = "province_id")
    private int countryId;

    @JsonProperty("code")
    @Column(name = "county_code")
    private int code;


}

