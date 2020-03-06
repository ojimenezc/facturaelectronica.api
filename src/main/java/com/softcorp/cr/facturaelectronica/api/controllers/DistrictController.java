

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.entities.CountiesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.DistrictEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/districts")
public class DistrictController extends BaseController {

    @Cacheable("districts")
    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<DistrictEntity> getByCounty(int countyId, int provinceCode) {
        return districtsRepository.getByCountyAndProvinceId(countyId, provinceCode);
    }
}
