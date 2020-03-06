/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.entities.CompanyActivityEntity;
import com.softcorp.cr.facturaelectronica.api.entities.EconomicActivityEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/activities")
public class EconomicActivitiesController extends BaseController {
    @Cacheable("activities")
    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<EconomicActivityEntity> get(int offset, int pageSize) {
        try {
            return economicActivitiesRepository.getAllOffset(offset, pageSize);
        } catch (Exception e) {
            loggerService.error(e);
            throw e;
        }
    }


    @RequestMapping(value = "/getbycompany", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<CompanyActivityEntity> getbycompany(int companyId) {
        try {
            return companyActivitiesRepository.getByCompany(companyId);
        } catch (Exception e) {
            loggerService.error(e);
            throw e;
        }
    }

    @RequestMapping(value = "/addtocompany", method = RequestMethod.POST, headers = "Accept=application/json")
    public List<CompanyActivityEntity> addtocompany(@RequestBody CompanyActivityEntity companyActivityEntity) {
        try {
            companyActivitiesRepository.save(companyActivityEntity);
            return companyActivitiesRepository.getByCompany(companyActivityEntity.getCompanyId());
        } catch (Exception e) {
            loggerService.error(e);
            throw e;
        }
    }

    @RequestMapping(value = "/removefromcompany", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public boolean removefromcompany(int companyId, String code) {
        try {
            CompanyActivityEntity toDelete = companyActivitiesRepository.getByCompanyAndCode(companyId, code);
            if (null != toDelete) {
                companyActivitiesRepository.delete(toDelete);
            }
            return true;
        } catch (Exception e) {
            loggerService.error(e);
            throw e;
        }
    }


}
