

package com.softcorp.cr.facturaelectronica.api.exceptions;

public class ElectronicBillingException extends Exception {

    public ElectronicBillingException(String message, String errorCode) {
        this.setErrorMessage(message);
        this.setErrorCode(errorCode);
    }

    private String errorCode;
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
