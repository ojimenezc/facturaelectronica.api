/*
 * Copyright (c) 2020.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.helpers;

import java.time.Instant;

public class TokenHelper {

    private static String token;
    private static Instant expirationDate;

    public static String getToken() {

        if (null != expirationDate && Instant.now().compareTo(expirationDate) >= 0) {
            TokenHelper.token = null;
            return null;
        }

        return token;
    }

    public static void setExpirationDate(Instant expirationDate) {
        TokenHelper.expirationDate = expirationDate;
    }

    public static void setToken(String token) {
        TokenHelper.token = token;
    }
}
