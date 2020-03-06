/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.helpers;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BillingSecurityCodeGenerator {
    public static String getSecurityCode() {
        String securityCode = "";

        securityCode = String.format("%08d", LocalDate.now().getDayOfYear() + LocalDateTime.now().getHour()+LocalDateTime.now().getSecond());

        return securityCode;
    }
}
