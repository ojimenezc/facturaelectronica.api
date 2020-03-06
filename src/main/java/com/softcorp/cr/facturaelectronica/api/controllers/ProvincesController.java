/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.entities.CustomerCompanyEntity;
import com.softcorp.cr.facturaelectronica.api.entities.CustomersEntity;
import com.softcorp.cr.facturaelectronica.api.entities.IdentificationTypesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.ProvincesEntity;
import com.softcorp.cr.facturaelectronica.api.security.encription.Encrypter;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/provinces")
public class ProvincesController extends BaseController {

    @Cacheable("provinces")
    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<ProvincesEntity> get() {
        return (List<ProvincesEntity>) provincesRepository.findAll();
    }
}
