/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.entities.CountiesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.NeighborhoodEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/neighborhoods")
public class NeighborhoodController extends BaseController {

    @Cacheable("neighborhoods")
    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<NeighborhoodEntity> getByDistrict(int districtId) {
        return neighborhoodRepository.getByDistrictId(districtId);
    }
}
