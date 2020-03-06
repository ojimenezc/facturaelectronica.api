

package com.softcorp.cr.facturaelectronica.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table(name = "unitmeasures", schema = "facturaelectronica")
@Entity
public class UnitMeasureEntity {
    @Id
    @GeneratedValue
    @JsonProperty(value = "id")
    private int id;
    @JsonProperty("name")
    @Column(name = "unit_name")
    private String name;
    @JsonProperty("code")
    @Column(name = "unit_code")
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
