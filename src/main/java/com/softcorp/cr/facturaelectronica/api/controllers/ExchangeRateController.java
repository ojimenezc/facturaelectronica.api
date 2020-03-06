

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.signer.XmlHelper;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
@RestController
@RequestMapping("api/exchangerate")
public class ExchangeRateController extends BaseController {

    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public ResponseEntity<Float> get() throws JAXBException {
        try {
            RestTemplate restTemplate = new RestTemplate();

            LocalDateTime datetime = LocalDateTime.now();
            String today = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(datetime);
            MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
            map.add("Indicador", "318");
            map.add("FechaInicio", today);
            map.add("FechaFinal", today);
            map.add("Nombre", "SOFTCORP-CR S.A");
            map.add("SubNiveles", "NO");
            map.add("CorreoElectronico", "ojimenez@softcorp-cr.com");
            map.add("Token", "RTJFFMC3R1");

            String requestURL = "https://gee.bccr.fi.cr/Indicadores/Suscripciones/WS/wsindicadoreseconomicos.asmx/ObtenerIndicadoresEconomicos";

            ResponseEntity<String> response = restTemplate.postForEntity(requestURL, map, String.class);
            int firIndexOf = response.getBody().indexOf("<NUM_VALOR>") + 11;
            int lastIndexOf = response.getBody().indexOf("</NUM_VALOR>");
            String substring = response.getBody().substring(firIndexOf, lastIndexOf);
            return new ResponseEntity<>(Float.parseFloat(substring), HttpStatus.OK);
        } catch (Exception e) {
            throw e;
        }
    }
}
