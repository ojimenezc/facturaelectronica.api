/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.dtos.CompaniesSaveRequestDTO;
import com.softcorp.cr.facturaelectronica.api.entities.CompaniesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.CustomerCompanyEntity;
import com.softcorp.cr.facturaelectronica.api.entities.DocumentsEntity;
import com.softcorp.cr.facturaelectronica.api.security.encription.Encrypter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/companies")
public class CompaniesController extends BaseController {
    Encrypter encrypter = new Encrypter();

    @RequestMapping(value = "/save", method = RequestMethod.POST, headers = "Accept=application/json")
    public CompaniesEntity save(@RequestBody CompaniesSaveRequestDTO request) {
        try {
            CompaniesEntity newCompany = request.getCompany();
            boolean isUpdate = newCompany.getId() > 0;
            newCompany.setAtvPassword(encrypter.encrypt(request.getCompany().getAtvPassword()));
            newCompany.setCertificatePin(encrypter.encrypt(request.getCompany().getCertificatePin()));
            newCompany.setAtvCertificate(encrypter.encrypt(request.getCompany().getAtvCertificate()));
            newCompany.setActive(true);
            CompaniesEntity newCompanySaved = companiesRepository.save(newCompany);
            if (null != newCompanySaved && newCompanySaved.getId() > 0 && !isUpdate) {
                CustomerCompanyEntity customerCompany = new CustomerCompanyEntity();
                customerCompany.setCompanyId(newCompanySaved.getId());
                customerCompany.setCustomerId(request.getCustomerId());
                customerCompaniesRepository.save(customerCompany);
            }
            newCompanySaved.setCertificatePin(encrypter.decrypt(newCompanySaved.getCertificatePin()));
            newCompanySaved.setAtvPassword(encrypter.decrypt(newCompanySaved.getAtvPassword()));
            newCompanySaved.setAtvCertificate(encrypter.decrypt(newCompanySaved.getAtvCertificate()));
            return newCompanySaved;
        } catch (Exception e) {
            loggerService.error(e);
            return null;
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, headers = "Accept=application/json")
    public CompaniesEntity update(@RequestBody CompaniesSaveRequestDTO request) {
        try {
            boolean isUpdate = request.getCompany().getId() > 0;
            request.getCompany().setAtvPassword(encrypter.encrypt(request.getCompany().getAtvPassword()));
            request.getCompany().setCertificatePin(encrypter.encrypt(request.getCompany().getCertificatePin()));
            request.getCompany().setAtvCertificate(encrypter.encrypt(request.getCompany().getAtvCertificate()));
            if (!isUpdate) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "The company id is null. To update the id is required");
            }
            Optional<CompaniesEntity> existing = companiesRepository.findById(request.getCompany().getId());
            if (existing.isPresent()) {

                CompaniesEntity newCompanySaved = companiesRepository.save(request.getCompany());
                newCompanySaved.setCertificatePin(encrypter.decrypt(newCompanySaved.getCertificatePin()));
                newCompanySaved.setAtvPassword(encrypter.decrypt(newCompanySaved.getAtvPassword()));
                newCompanySaved.setAtvCertificate(encrypter.decrypt(newCompanySaved.getAtvCertificate()));
                return newCompanySaved;
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The compnay with ID = " + request.getCompany().getId() + " does not exist");
            }

        } catch (Exception e) {
            loggerService.error(e);
            return null;
        }
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<CompaniesEntity> get(int customerId) {
        try {
            List<CompaniesEntity> returnValue = companiesRepository.getCompnaiesByCustomer(customerId);
            returnValue.stream().forEach(company -> {
                company.setCertificatePin(encrypter.decrypt(company.getCertificatePin()));
                company.setAtvPassword(encrypter.decrypt(company.getAtvPassword()));
                company.setAtvCertificate(encrypter.encrypt(company.getAtvCertificate()));
            });
            return returnValue;
        } catch (Exception e) {
            loggerService.error(e);
            throw e;
        }
    }

    @RequestMapping(value = "/getcompanyinfo", method = RequestMethod.GET, headers = "Accept=application/json")
    public CompaniesEntity getById(int companyId) {
        try {
            Optional<CompaniesEntity> companyInfo = companiesRepository.findById(companyId);
            if (companyInfo.isPresent()) {
                CompaniesEntity returnValue = companyInfo.get();
                returnValue.setCertificatePin(encrypter.decrypt(returnValue.getCertificatePin()));
                returnValue.setAtvPassword(encrypter.decrypt(returnValue.getAtvPassword()));
                returnValue.setAtvCertificate(encrypter.decrypt(returnValue.getAtvCertificate()));
                return returnValue;
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The company with id = " + companyId + " was not found");
            }
        } catch (Exception e) {
            loggerService.error(e);
            throw e;
        }
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public boolean delete(int companyId) {
        try {
            Optional<CompaniesEntity> companyToRemove = companiesRepository.findById(companyId);
            if (companyToRemove.isPresent()) {
                companyToRemove.get().setActive(false);
                companiesRepository.save(companyToRemove.get());
                return true;
            } else {
                loggerService.error("The company with id " + companyId + " was not found and could not be deleted");
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Client not found"
                );
            }
        } catch (Exception e) {
            loggerService.error(e.getMessage());
            throw e;
        }
    }


    @RequestMapping(value = "/documents", method = RequestMethod.GET, headers = "Accept=application/json")
    public ArrayList<DocumentsEntity> getDocuments(int companyId) {
        return documentsRepository.getByCompany(companyId);
    }
}
