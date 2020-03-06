/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.dtos;

public class DocumentSendRequest {
    private String clave;
    private String fecha;
    private EmisorReceptorForPostRequest emisor;
    private EmisorReceptorForPostRequest receptor;
    private String comprobanteXml;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public EmisorReceptorForPostRequest getEmisor() {
        return emisor;
    }

    public void setEmisor(EmisorReceptorForPostRequest emisor) {
        this.emisor = emisor;
    }

    public EmisorReceptorForPostRequest getReceptor() {
        return receptor;
    }

    public void setReceptor(EmisorReceptorForPostRequest receptor) {
        this.receptor = receptor;
    }

    public String getComprobanteXml() {
        return comprobanteXml;
    }

    public void setComprobanteXml(String comprobanteXml) {
        this.comprobanteXml = comprobanteXml;
    }
}
