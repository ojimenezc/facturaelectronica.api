

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "company_activities", schema = "facturaelectronica")
@Entity
public class CompanyActivityEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty("companyId")
    @Column(name = "company_id")
    private int companyId;

    @JsonProperty("activityCode")
    @Column(name = "activity_code")
    private String activityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }
}
