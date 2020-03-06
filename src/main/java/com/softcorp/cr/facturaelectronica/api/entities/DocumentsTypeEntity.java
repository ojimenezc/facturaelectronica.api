

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.Instant;

@Table(name = "document_types", schema = "facturaelectronica")
@Entity
public class DocumentsTypeEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;
    @JsonProperty("documentName")
    @Column(name = "document_name")
    private String documentName;
    @JsonProperty("documentCode")
    @Column(name = "document_code")
    private BigInteger documentCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public BigInteger getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(BigInteger documentCode) {
        this.documentCode = documentCode;
    }
}
