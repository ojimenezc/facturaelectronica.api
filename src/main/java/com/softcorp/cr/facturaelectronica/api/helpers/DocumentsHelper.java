/*
 * Copyright (c) 2020.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.helpers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softcorp.cr.facturaelectronica.api.dtos.RestClientResponse;
import com.softcorp.cr.facturaelectronica.api.dtos.StatusResponse;
import com.softcorp.cr.facturaelectronica.api.entities.CompaniesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.DocumentsEntity;
import com.softcorp.cr.facturaelectronica.api.exceptions.ElectronicBillingException;
import com.softcorp.cr.facturaelectronica.api.helpers.interfaces.IRestClient;
import com.softcorp.cr.facturaelectronica.api.repositories.CompaniesRepository;
import com.softcorp.cr.facturaelectronica.api.repositories.DocumentsRepository;
import com.softcorp.cr.facturaelectronica.api.security.encription.Encrypter;
import com.softcorp.cr.facturaelectronica.api.services.implementations.LoggerService;
import com.softcorp.cr.facturaelectronica.api.services.implementations.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

@Configuration
@ComponentScan("com.softcorp.cr.facturaelectronica.api.helpers")
public class DocumentsHelper {
    private Encrypter encrypter = new Encrypter();

    @Autowired
    DocumentsRepository documentsRepository;

    @Autowired
    TokenService tokenService;
    @Autowired
    LoggerService loggerService;
    @Autowired
    CompaniesRepository companiesRepository;

    private ObjectMapper objectMapper = new ObjectMapper().
            configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


    @Value("${hacienda.status.uri}")
    private String statusRequestUri;

    public void saveDocument(int companyId, String key, String jsonBase64, String xmlBase64) {
        DocumentsEntity newDocumentRegistry = new DocumentsEntity();
        newDocumentRegistry.setCompanyId(companyId);
        newDocumentRegistry.setGenerationDate(Timestamp.from(Instant.now()));
        newDocumentRegistry.setKey(key);
        newDocumentRegistry.setJSONBase64(jsonBase64);
        newDocumentRegistry.setXMLBase64(xmlBase64);
        newDocumentRegistry.setEmailStatus(0);
        documentsRepository.save(newDocumentRegistry);
    }

    public StatusResponse processStatus(String documentId) throws Exception {
        StatusResponse statusResponse = null;
        try {
            DocumentsEntity document = documentsRepository.getByDocumentKey(documentId);
            if (document == null) {
                throw new Exception("The document with id " + documentId + " was not found in the database");
            }

            Optional<CompaniesEntity> companyInformation = Optional.ofNullable(companiesRepository.findById(document.getCompanyId())
                    .orElseThrow(() -> new ElectronicBillingException("Company " + document.getCompanyId() + " was not found", "001")));

            String token = tokenService.getTokenFromHacienda(companyInformation.get().getAtvUsername(),
                    encrypter.decrypt(companyInformation.get().getAtvPassword()));

            IRestClient client = new RestClient(token);
            RestClientResponse response = client.get(statusRequestUri + documentId, null);

            statusResponse = objectMapper.readValue(response.getBody().toString(), StatusResponse.class);

            document.setStatusIndicator(statusResponse.getStatusIndicator());
            document.setStatusRequestDate(statusResponse.getDateTime());
            document.setHaciendaReceiptXML(statusResponse.getRespuestaXML());
            documentsRepository.save(document);

        } catch (ElectronicBillingException ex) {
            loggerService.error(ex.getErrorMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getErrorMessage());
        } catch (Exception e) {
            loggerService.error(e.getMessage());
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
                String errorMessage = badRequest.getResponseHeaders().get("X-Error-Cause").toString();
                loggerService.error(errorMessage);
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, errorMessage);
            } else {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            }
        }
        return statusResponse;
    }

}
