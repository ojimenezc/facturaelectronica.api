/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.dtos.ClientRequestDto;
import com.softcorp.cr.facturaelectronica.api.entities.TaxesEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/taxes")
public class TaxesController extends BaseController {

    @Cacheable(cacheNames = "taxes")
    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public Iterable<TaxesEntity> get() {
        try {
            return taxesRepository.findAll();
        } catch (Exception e) {
            loggerService.error(e);
            return null;
        }
    }
}