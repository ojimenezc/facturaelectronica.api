

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "clients", schema = "facturaelectronica")
@Entity
public class ClientEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty("identificationType")
    @Column(name = "identification_type")
    private int identificationType;

    public int getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(int identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getOtherSigns() {
        return otherSigns;
    }

    public void setOtherSigns(String otherSigns) {
        this.otherSigns = otherSigns;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public int getCounty() {
        return county;
    }

    public void setCounty(int county) {
        this.county = county;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("identificationNumber")
    @Column(name = "identification_number")
    private String identificationNumber;

    @JsonProperty("clientName")
    @Column(name = "client_name")
    private String clientName;

    @JsonProperty("contactPhone")
    @Column(name = "contact_phone")
    private String contactPhone;

    @JsonProperty("contactEmail")
    @Column(name = "contact_email")
    private String contactEmail;

    @JsonProperty("otherSigns")
    @Column(name = "other_signs")
    private String otherSigns;

    @JsonProperty("province")
    @Column(name = "province")
    private int province;

    @JsonProperty("district")
    @Column(name = "district")
    private int district;

    @JsonProperty("county")
    @Column(name = "county")
    private int county;

}
