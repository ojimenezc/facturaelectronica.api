/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.helpers.DocumentsHelper;
import com.softcorp.cr.facturaelectronica.api.repositories.*;
import com.softcorp.cr.facturaelectronica.api.services.implementations.LoggerService;
import com.softcorp.cr.facturaelectronica.api.services.implementations.TokenService;
import com.softcorp.cr.facturaelectronica.api.signer.XMLSigner;
import com.softcorp.cr.facturaelectronica.api.signer.XmlHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class BaseController {

    @Autowired
    DocumentsHelper documentsHelper;
    @Autowired
    LoggerService loggerService;
    @Autowired
    CustomersRepository customersRepository;
    @Autowired
    ConsecutivesRepository consecutivesRepository;
    @Autowired
    CompaniesRepository companiesRepository;
    @Autowired
    OfficesRepository officesRepository;
    @Autowired
    CountriesRepository countriesRepository;
    @Autowired
    DocumentsRepository documentsRepository;
    @Autowired
    DocumentTypesRepository documentTypesRepository;
    @Autowired
    CustomerCompaniesRepository customerCompaniesRepository;
    @Autowired
    IdentificationTypesRepository identificationTypesRepository;
    @Autowired
    ProvincesRepository provincesRepository;
    @Autowired
    CountiesRepository countiesRepository;
    @Autowired
    NeighborhoodRepository neighborhoodRepository;
    @Autowired
    DistrictsRepository districtsRepository;
    @Autowired
    ClientsRepository clientsRepository;
    @Autowired
    CustomersClientRepository customersClientRepository;
    @Autowired
    CurrenciesRepository currenciesRepository;
    @Autowired
    PointOfSalesRepository pointOfSalesRepository;
    @Autowired
    TaxesRepository taxesRepository;
    @Autowired
    UnitMeasuresRepository unitMeasuresRepository;
    @Autowired
    ProductsRepository productsRepository;
    @Autowired
    RatesRepository ratesRepository;
    @Autowired
    EconomicActivitiesRepository economicActivitiesRepository;
    @Autowired
    CompanyActivitiesRepository companyActivitiesRepository;
    @Autowired
    XMLSigner signer;
    @Autowired
    TokenService tokenService;
    @Autowired
    XmlHelper xmlHelper;
}
