/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.entities.TaxesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.UnitMeasureEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/units")
public class UnitMeasuresController extends BaseController {

    @Cacheable("unitMeasure")
    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public Iterable<UnitMeasureEntity> get() {
        try {
            return unitMeasuresRepository.findAll();
        } catch (Exception e) {
            loggerService.error(e);
            return null;
        }
    }
}