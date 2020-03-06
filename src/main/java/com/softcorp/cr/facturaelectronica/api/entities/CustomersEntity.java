/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Table(name = "customers", schema = "facturaelectronica")
@Entity
public class CustomersEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;
    @JsonProperty("representativeName")
    @Column(name = "representative_name")
    private String representativeName;
    @JsonProperty("representativePhone")
    @Column(name = "representative_phone")
    private String representativePhone;
    @JsonProperty("representativeEmail")
    @Column(name = "representative_email")
    private String representativeEmail;
    @JsonProperty("username")
    @Column(name = "username")
    private String username;
    @JsonProperty("password")
    @Column(name = "password")
    private String password;
    @JsonProperty("biometrics")
    @Column(name = "biometric")
    private byte[] biometrics;
    @JsonProperty("joining_date")
    @Column(name = "joiningDate")
    private Timestamp joiningDate;
    @JsonProperty("lastUpdate")
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getRepresentativePhone() {
        return representativePhone;
    }

    public void setRepresentativePhone(String representativePhone) {
        this.representativePhone = representativePhone;
    }

    public String getRepresentativeEmail() {
        return representativeEmail;
    }

    public void setRepresentativeEmail(String representativeEmail) {
        this.representativeEmail = representativeEmail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getBiometrics() {
        return biometrics;
    }

    public void setBiometrics(byte[] biometrics) {
        this.biometrics = biometrics;
    }

    public Timestamp getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Timestamp joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public CustomersEntity() {
        this.joiningDate = Timestamp.from(Instant.now());
        this.lastUpdate = Timestamp.from(Instant.now());
    }
}
