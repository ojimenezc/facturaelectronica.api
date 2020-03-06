/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.services.declarations;

import com.softcorp.cr.facturaelectronica.api.dtos.DocumentSendRequest;

public interface IBillingService {
    boolean sendDocument(DocumentSendRequest sendRequest);
}
