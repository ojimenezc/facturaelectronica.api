

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "identification_types", schema = "facturaelectronica")
@Entity
public class IdentificationTypesEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty("name")
    @Column(name = "identification_name")
    private String name;

    @JsonProperty("code")
    @Column(name = "identification_code")
    private int code;
}

