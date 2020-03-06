/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "products", schema = "facturaelectronica")
@Entity
public class ProductsEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty("taxType")
    @Column(name = "tax_code")
    private String taxType;

    @JsonProperty("taxName")
    @Column(name = "tax_name")
    private String taxName;

    @JsonProperty("rateType")
    @Column(name = "rate_type")
    private String rateType;

    @JsonProperty("unitMeasure")
    @Column(name = "unit_measure")
    private String unitMeasure;

    @JsonProperty("productName")
    @Column(name = "name")
    private String productName;

    @JsonProperty("productCode")
    @Column(name = "code")
    private String productCode;

    @JsonProperty("productPrice")
    @Column(name = "price")
    private float productPrice;

    @JsonProperty("taxRate")
    @Column(name = "tax_rate")
    private float taxRate;

    @JsonProperty("taxRateCode")
    @Column(name = "tax_rate_code")
    private String taxRateCode;

    @JsonProperty("prodCurrency")
    @Column(name = "currency")
    private String prodCurrency;


    @JsonProperty("customerId")
    @Column(name = "customer_id")
    private int customerId;

}
