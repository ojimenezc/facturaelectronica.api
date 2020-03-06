/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */
package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.entities.OfficesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.PointOfSaleEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Configuration
@RestController
@RequestMapping("api/pos")
public class PointsOfSaleController extends BaseController {

    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<PointOfSaleEntity> get(int officeId) {
        try {
            return pointOfSalesRepository.getByOfficeId(officeId);
        } catch (Exception e) {
            loggerService.error(e.getMessage());
            throw e;
        }
    }
}
