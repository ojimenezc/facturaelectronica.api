

package com.softcorp.cr.facturaelectronica.api.dtos;

import com.softcorp.cr.facturaelectronica.api.dtos.debitnotes.NotaDebitoElectronica;

public class DebitNoteRequest {
    public NotaDebitoElectronica getDocument() {
        return document;
    }

    public void setDocument(NotaDebitoElectronica document) {
        this.document = document;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public int getPosId() {
        return posId;
    }

    public void setPosId(int posId) {
        this.posId = posId;
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    private NotaDebitoElectronica document;
    private int companyId;
    private int officeId;
    private int posId;
    private int documentType;
}
