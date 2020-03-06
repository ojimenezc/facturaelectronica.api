

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "currencies", schema = "facturaelectronica")
@Entity
public class CurrenciesEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty("name")
    @Column(name = "currency_name")
    private String name;

    @JsonProperty("code")
    @Column(name = "currency_code")
    private String code;



}

