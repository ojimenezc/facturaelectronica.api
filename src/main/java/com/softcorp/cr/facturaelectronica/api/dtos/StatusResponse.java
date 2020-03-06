

package com.softcorp.cr.facturaelectronica.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class StatusResponse {
    @JsonProperty("clave")
    private String key;
    @JsonProperty("fecha")
    private Timestamp dateTime;
    @JsonProperty("ind-estado")
    private String statusIndicator;

    public String getRespuestaXML() {
        return respuestaXML;
    }

    public void setRespuestaXML(String respuestaXML) {
        this.respuestaXML = respuestaXML;
    }

    @JsonProperty("respuesta-xml")
    private String respuestaXML;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public String getStatusIndicator() {
        return statusIndicator;
    }

    public void setStatusIndicator(String statusIndicator) {
        this.statusIndicator = statusIndicator;
    }
}
