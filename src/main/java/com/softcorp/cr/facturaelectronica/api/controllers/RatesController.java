/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.entities.RatesTypesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.TaxesEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/rates")
public class RatesController extends BaseController {

    @Cacheable("rates")
    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public Iterable<RatesTypesEntity> get() {
        try {
            return ratesRepository.findAll();
        } catch (Exception e) {
            loggerService.error(e);
            return null;
        }
    }
}