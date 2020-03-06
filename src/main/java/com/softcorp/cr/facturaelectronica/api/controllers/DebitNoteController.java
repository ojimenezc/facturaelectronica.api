/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.softcorp.cr.facturaelectronica.api.dtos.*;
import com.softcorp.cr.facturaelectronica.api.dtos.creditnotes.NotaCreditoElectronica;
import com.softcorp.cr.facturaelectronica.api.dtos.debitnotes.NotaDebitoElectronica;
import com.softcorp.cr.facturaelectronica.api.entities.CompaniesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.ConsecutivesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.DocumentsEntity;
import com.softcorp.cr.facturaelectronica.api.exceptions.ElectronicBillingException;
import com.softcorp.cr.facturaelectronica.api.helpers.RestClient;
import com.softcorp.cr.facturaelectronica.api.helpers.interfaces.IRestClient;
import com.softcorp.cr.facturaelectronica.api.security.encription.Encrypter;
import com.softcorp.cr.facturaelectronica.api.services.implementations.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Base64;
import java.util.Optional;

@Configuration
@RestController
@RequestMapping("api/debitnotes")
public class DebitNoteController extends BaseController {

    @Autowired
    private Environment environment;

    @Value("${documents.input}")
    private String documentsInput;
    @Value("${certficates.location}")
    private String certificateLocation;
    @Value("${hacienda.recepcion.uri}")
    private String haciendaRecepcionUri;

    @RequestMapping(value = "/generate", method = RequestMethod.POST, headers = "Accept=application/json")
    public GenerateDocumentResponse create(@RequestBody DebitNoteRequest request) throws IOException, SAXException, ParserConfigurationException {

        URI location = null;
        GenerateDocumentResponse generateDocumentResponse = new GenerateDocumentResponse();
        NotaDebitoElectronica notaDebitoElectronica = null;
        String base64Xml = null;
        try {

            Optional<CompaniesEntity> companyInformation = Optional.ofNullable(companiesRepository.findById(request.getCompanyId())
                    .orElseThrow(() -> new ElectronicBillingException("Company " + request.getCompanyId() + " was not found", "001")));

            notaDebitoElectronica = request.getDocument();

            Encrypter encrypter = new Encrypter();

            File temp = File.createTempFile(notaDebitoElectronica.getClave(), ".xml");
            String tempPath = temp.getPath();

            String xmlUnsigned = tempPath;
            Document sourceDoc = xmlHelper.getDocument(notaDebitoElectronica, NotaDebitoElectronica.class);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            Result output = new StreamResult(new File(xmlUnsigned));
            Source input = new DOMSource(sourceDoc);

            transformer.transform(input, output);
            base64Xml = signer.sign(companyInformation.get(), notaDebitoElectronica.getClave(),
                    "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica", tempPath);

            DocumentSendRequest sendRequest = new DocumentSendRequest();
            sendRequest.setClave(notaDebitoElectronica.getClave());

            EmisorReceptorForPostRequest emisor = new EmisorReceptorForPostRequest();
            emisor.setNumeroIdentificacion(notaDebitoElectronica.getEmisor().getIdentificacion().getNumero());
            emisor.setTipoIdentificacion(notaDebitoElectronica.getEmisor().getIdentificacion().getTipo());
            sendRequest.setEmisor(emisor);

            EmisorReceptorForPostRequest receptor = new EmisorReceptorForPostRequest();
            receptor.setNumeroIdentificacion(notaDebitoElectronica.getReceptor().getIdentificacion().getNumero());
            receptor.setTipoIdentificacion(notaDebitoElectronica.getReceptor().getIdentificacion().getTipo());
            sendRequest.setReceptor(receptor);

            sendRequest.setComprobanteXml(base64Xml);
            sendRequest.setFecha(notaDebitoElectronica.getFechaEmision().toGregorianCalendar().toInstant().toString());

            //SEND DOC TO HACIENDA
            String token = tokenService.getTokenFromHacienda(companyInformation.get().getAtvUsername(),
                    encrypter.decrypt(companyInformation.get().getAtvPassword()));

            IRestClient client = new RestClient(token);
            RestClientResponse response = client.post(haciendaRecepcionUri, sendRequest);

            if (null != response.getHeaders() && null != response.getHeaders().getLocation()) {
                location = response.getHeaders().getLocation();
            }

            loggerService.info("Document number " + notaDebitoElectronica.getClave() + " was sent to Hacienda. Location to validate document  = [ " + location.toString() + " ]");
            generateDocumentResponse.setLocation(location.getPath());
            generateDocumentResponse.setXml(sendRequest.getComprobanteXml());

            ConsecutivesEntity currentConsecutive = consecutivesRepository.getCurrentConsecutiveInformation(request.getCompanyId(), request.getOfficeId(), request.getPosId(), request.getDocumentType());
            currentConsecutive.setConsecutive(notaDebitoElectronica.getNumeroConsecutivo());
            currentConsecutive.setDocumentKey(notaDebitoElectronica.getClave());
            currentConsecutive.setGenerationTimestamp(Timestamp.from(Instant.now()));
            consecutivesRepository.save(currentConsecutive);
            String jsonBase64 = "";
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(notaDebitoElectronica);
            jsonBase64 = Base64.getEncoder().encodeToString(json.getBytes());
            documentsHelper.saveDocument(request.getCompanyId(), notaDebitoElectronica.getClave(), jsonBase64, base64Xml);

        } catch (ElectronicBillingException ex) {
            loggerService.error("The document number " + (null != notaDebitoElectronica ? notaDebitoElectronica.getClave() : "") + " was not successfully sent to hacienda. Error cause = " + ex.getErrorMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getErrorMessage());
        } catch (Exception e) {

            HttpClientErrorException.BadRequest badRequest = null;
            try {
                badRequest = ((HttpClientErrorException.BadRequest) e);
            } catch (Exception ex) {

            }


            try {
                HttpClientErrorException.Forbidden forbidden = ((HttpClientErrorException.Forbidden) e);
                loggerService.error(forbidden.getResponseBodyAsString());
            } catch (Exception ex) {

            }

            if (null != badRequest) {
                loggerService.error("The document number " + (null != notaDebitoElectronica ? notaDebitoElectronica.getClave() : "") + " was not successfully sent to hacienda. Error cause = " + badRequest.getResponseHeaders().get("X-Error-Cause"));
                String errorMessage = badRequest.getResponseHeaders().get("X-Error-Cause").toString();
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, errorMessage);
            } else {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            }
        }

        return generateDocumentResponse;
    }


}
