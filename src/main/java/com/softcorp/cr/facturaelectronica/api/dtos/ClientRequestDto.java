

package com.softcorp.cr.facturaelectronica.api.dtos;

import com.softcorp.cr.facturaelectronica.api.entities.ClientEntity;

public class ClientRequestDto {
    private ClientEntity client;
    private int customer;

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }
}
