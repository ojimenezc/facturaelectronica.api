

package com.softcorp.cr.facturaelectronica.api.services.implementations;

import com.softcorp.cr.facturaelectronica.api.services.declarations.ILoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
@Configuration
@ComponentScan("com.softcorp.cr.facturaelectronica.api.services.implementations")
public class LoggerService implements ILoggerService {


    RestTemplate restTemplate = new RestTemplate();

    @Override
    public void error(Object object) {
        //TODO:IMPLEMENT OWN LOGGING STRATEGY
    }

    @Override
    public void info(Object object) throws IOException {
        //TODO:IMPLEMENT OWN LOGGING STRATEGY
    }
}
