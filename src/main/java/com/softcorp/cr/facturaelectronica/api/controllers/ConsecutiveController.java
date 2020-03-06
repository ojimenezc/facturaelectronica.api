/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.dtos.NextKeyResponse;
import com.softcorp.cr.facturaelectronica.api.entities.*;
import com.softcorp.cr.facturaelectronica.api.exceptions.ElectronicBillingException;
import com.softcorp.cr.facturaelectronica.api.helpers.BillingSecurityCodeGenerator;
import com.softcorp.cr.facturaelectronica.api.repositories.DocumentTypesRepository;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/consecutives")
public class ConsecutiveController extends BaseController {

    @RequestMapping(value = "/generate", method = RequestMethod.GET, headers = "Accept=application/json")
    public NextKeyResponse getNextDocumentID(int companyId, int officeId, int posId, int documentType, int documentSituation) throws ResponseStatusException {
        return getNextDocumentKey(companyId, officeId, posId, documentType, documentSituation);
    }


    private NextKeyResponse getNextDocumentKey(int companyId, int officeId, int posId, int documentType, int documentSituation) throws ResponseStatusException {
        String nextID = "";
        int consecutive = 0;
        ConsecutivesEntity currentConsecutive = null;
        String nextConsecutive = null;
        Optional<CompaniesEntity> company = null;
        Optional<OfficesEntity> officesEntity;
        Optional<CountriesEntity> countriesEntity;

        officesEntity = officesRepository.findById(officeId);
        if (!officesEntity.isPresent()) {
            ResponseStatusException exception = new ResponseStatusException(HttpStatus.NOT_FOUND, "[10003] The office with id " + officeId + " does not exists.");
            loggerService.error(exception.getMessage());
            throw exception;
        }

        //Information gathering
        company = companiesRepository.findById(companyId);
        if (!company.isPresent()) {
            ResponseStatusException exception = new ResponseStatusException(HttpStatus.NOT_FOUND, "[10004] The company with id " + companyId + " was not found in the database");
            loggerService.error(exception.getMessage());
            throw exception;
        }

        countriesEntity = countriesRepository.findById(company.get().getCountryId());
        if (!countriesEntity.isPresent()) {
            ResponseStatusException exception = new ResponseStatusException(HttpStatus.NOT_FOUND, "[10001] The county id " + companyId + " provided was not found in the database");
            loggerService.error(exception.getMessage());
            throw exception;
        }

        currentConsecutive = consecutivesRepository.getCurrentConsecutiveInformation(companyId, officeId, posId, documentType);

        if (currentConsecutive == null) {
            //if consecutive is null then create it
            ConsecutivesEntity newConsecutive = new ConsecutivesEntity();
            newConsecutive.setCompanyID(companyId);
            newConsecutive.setOfficeID(officeId);
            newConsecutive.setPosID(posId);
            newConsecutive.setDocumentType(documentType);
            nextConsecutive = officesEntity.get().getCode() +
                    String.format("%05d", posId) +
                    String.format("%02d", documentType) +
                    String.format("%010d", 1);
            newConsecutive.setConsecutive(nextConsecutive);
            newConsecutive.setDocumentKey("0");
            newConsecutive.setGenerationTimestamp(Timestamp.from(Instant.now()));
            currentConsecutive = consecutivesRepository.save(newConsecutive);
        } else {
            if (currentConsecutive.getDocumentKey().equals("0")) {
                nextConsecutive = currentConsecutive.getConsecutive();
            } else {
                consecutive = Integer.parseInt(currentConsecutive.getConsecutive().substring(10, currentConsecutive.getConsecutive().length()));
                nextConsecutive = officesEntity.get().getCode() +
                        String.format("%05d", posId) +
                        String.format("%02d", documentType) +
                        String.format("%010d", ++consecutive);
            }
        }

        if (currentConsecutive == null) {
            ResponseStatusException exception = new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "[10002] An error occurred when generating the new consecutive for company id " + company + " with for POS ID " + posId);
            loggerService.error(exception.getMessage());
            throw exception;
        }

        nextID = countriesEntity.get().getCode() +
                String.format("%02d", LocalDate.now().getDayOfMonth()) +
                String.format("%02d", LocalDate.now().getMonth().getValue()) +
                String.valueOf(LocalDate.now().getYear()).substring(2, 4) +
                StringUtils.leftPad(company.get().getIdentificationNumber(), 12, "0") +
                nextConsecutive +
                documentSituation +
                BillingSecurityCodeGenerator.getSecurityCode();

        NextKeyResponse response = new NextKeyResponse();
        response.setConsecutive(nextConsecutive);
        response.setKey(nextID);
        return response;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<ConsecutivesEntity> companyConsecutives(int companyId, int officeId, int posId) {
        try {
            return consecutivesRepository.getCompanyConsecutives(companyId, officeId, posId);
        } catch (Exception e) {
            loggerService.error(e.getMessage());
            throw e;
        }
    }

    @RequestMapping(value = "/updatelist", method = RequestMethod.PUT, headers = "Accept=application/json")
    public List<ConsecutivesEntity> updateList(@RequestBody List<ConsecutivesEntity> toUpdate) {
        try {
            if (null == toUpdate) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The request body is null");
            }

            toUpdate.stream().forEach(item -> {
                if (null == item.getGenerationTimestamp()) {
                    item.setGenerationTimestamp(Timestamp.from(Instant.now()));
                }
            });

            consecutivesRepository.saveAll(toUpdate);
            return toUpdate;

        } catch (Exception e) {
            loggerService.error(e.getMessage());
            throw e;
        }
    }
}
