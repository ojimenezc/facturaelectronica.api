

package com.softcorp.cr.facturaelectronica.api.services.declarations;

import com.softcorp.cr.facturaelectronica.api.dtos.DocumentSendRequest;

public interface IBillingService {
    boolean sendDocument(DocumentSendRequest sendRequest);
}
