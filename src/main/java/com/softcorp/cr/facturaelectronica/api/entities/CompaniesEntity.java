/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "companies", schema = "facturaelectronica")
@Entity
public class CompaniesEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;
    @JsonProperty("companyName")
    @Column(name = "company_name")
    private String companyName;
    @JsonProperty("businessName")
    @Column(name = "business_name")
    private String businessName;
    @JsonProperty("identificationType")
    @Column(name = "identification_type")
    private int identificationType;
    @JsonProperty("identificationNumber")
    @Column(name = "identification_number")
    private String identificationNumber;
    @JsonProperty("contactEmail")
    @Column(name = "contact_email")
    private String contactEmail;
    @JsonProperty("contactPhone")
    @Column(name = "contact_phone")
    private String contactPhone;
    @JsonProperty("countryId")
    @Column(name = "country_id")
    private int countryId;
    @JsonProperty("provinceId")
    @Column(name = "province_id")
    private int provinceId;
    @JsonProperty("countyId")
    @Column(name = "county_id")
    private int countyId;
    @JsonProperty("districtId")
    @Column(name = "district_id")
    private int districtId;
    @JsonProperty("neigborhoodId")
    @Column(name = "neigborhood_id")
    private int neigborhoodId;
    @JsonProperty("postalCode")
    @Column(name = "postal_code")
    private String postalCode;
    @JsonProperty("defaultCurrency")
    @Column(name = "default_currency")
    private Integer defaultCurrency;
    @JsonProperty("atvUsername")
    @Column(name = "atv_username")
    private String atvUsername;
    @JsonProperty("atvPassword")
    @Column(name = "atv_password")
    private String atvPassword;
    @JsonProperty("certificatePin")
    @Column(name = "certificate_pin")
    private String certificatePin;
    @JsonProperty("atvCertificate")
    @Column(name = "certificate")
    private String atvCertificate;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("active")
    @Column(name = "active")
    private Boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

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

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public int getNeigborhoodId() {
        return neigborhoodId;
    }

    public void setNeigborhoodId(int neigborhoodId) {
        this.neigborhoodId = neigborhoodId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public Integer getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Integer defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public String getAtvUsername() {
        return atvUsername;
    }

    public void setAtvUsername(String atvUsername) {
        this.atvUsername = atvUsername;
    }

    public String getAtvPassword() {
        return atvPassword;
    }

    public void setAtvPassword(String atvPassword) {
        this.atvPassword = atvPassword;
    }

    public String getCertificatePin() {
        return certificatePin;
    }

    public void setCertificatePin(String certificatePin) {
        this.certificatePin = certificatePin;
    }

    public String getAtvCertificate() {
        return atvCertificate;
    }

    public void setAtvCertificate(String atvCertificate) {
        this.atvCertificate = atvCertificate;
    }
}
