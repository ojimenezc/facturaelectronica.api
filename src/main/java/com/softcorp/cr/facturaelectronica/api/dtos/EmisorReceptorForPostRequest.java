

package com.softcorp.cr.facturaelectronica.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmisorReceptorForPostRequest {

    @JsonProperty("tipoIdentificacion")
    private String tipoIdentificacion;

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    @JsonProperty("numeroIdentificacion")
    private String numeroIdentificacion;

}
