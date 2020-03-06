

package com.softcorp.cr.facturaelectronica.api.dtos;

import com.softcorp.cr.facturaelectronica.api.entities.CompaniesEntity;

public class CompaniesSaveRequestDTO {
    CompaniesEntity company;
    int customerId;

    public CompaniesEntity getCompany() {
        return company;
    }

    public void setCompany(CompaniesEntity company) {
        this.company = company;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
