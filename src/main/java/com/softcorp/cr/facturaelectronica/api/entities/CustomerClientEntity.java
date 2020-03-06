/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "customer_clients", schema = "facturaelectronica")
@Entity
public class CustomerClientEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty("apiCustomerId")
    @Column(name = "api_customer_id")
    private int apiCustomerId;

    @JsonProperty("clientId")
    @Column(name = "client_id")
    private int clientID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApiCustomerId() {
        return apiCustomerId;
    }

    public void setApiCustomerId(int apiCustomerId) {
        this.apiCustomerId = apiCustomerId;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }
}
