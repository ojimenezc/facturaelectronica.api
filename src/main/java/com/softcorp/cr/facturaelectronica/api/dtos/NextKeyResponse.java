

package com.softcorp.cr.facturaelectronica.api.dtos;

public class NextKeyResponse {

    private String key;
    private String consecutive;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getConsecutive() {
        return consecutive;
    }

    public void setConsecutive(String consecutive) {
        this.consecutive = consecutive;
    }
}
