/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.services.declarations;

import java.io.IOException;
import java.net.MalformedURLException;

public interface ILoggerService {

    void error(Object object);
    void info(Object object) throws IOException;
}
