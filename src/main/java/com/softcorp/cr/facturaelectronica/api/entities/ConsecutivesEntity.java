/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Table(name = "consecutives", schema = "facturaelectronica")
@Entity
public class ConsecutivesEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;
    @JsonProperty("companyID")
    @Column(name = "company_id")
    private int companyID;
    @JsonProperty("documentType")
    @Column(name = "document_type")
    private int documentType;
    @JsonProperty("posID")
    @Column(name = "pos_id")
    private int PosID;
    @JsonProperty("officeID")
    @Column(name = "office_id")
    private int officeID;
    @JsonProperty("consecutive")
    @Column(name = "consecutive")
    private String consecutive;
    @JsonProperty("documentKey")
    @Column(name = "document_key")
    private String documentKey;

    public Timestamp getGenerationTimestamp() {
        return generationTimestamp;
    }

    public void setGenerationTimestamp(Timestamp generationTimestamp) {
        this.generationTimestamp = generationTimestamp;
    }

    @JsonProperty("generationTimestamp")
    @Column(name = "generation_timestamp")
    private Timestamp generationTimestamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public int getPosID() {
        return PosID;
    }

    public void setPosID(int posID) {
        PosID = posID;
    }

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }

    public String getConsecutive() {
        return consecutive;
    }

    public void setConsecutive(String consecutive) {
        this.consecutive = consecutive;
    }

    public String getDocumentKey() {
        return documentKey;
    }

    public void setDocumentKey(String documentKey) {
        this.documentKey = documentKey;
    }

    public ConsecutivesEntity() {
    }
}
