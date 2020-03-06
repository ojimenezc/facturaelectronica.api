

package com.softcorp.cr.facturaelectronica.api.services.declarations;

import java.io.IOException;
import java.net.MalformedURLException;

public interface ILoggerService {

    void error(Object object);
    void info(Object object) throws IOException;
}
