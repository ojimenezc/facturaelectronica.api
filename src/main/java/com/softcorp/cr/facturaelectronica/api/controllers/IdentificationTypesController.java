

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.entities.IdentificationTypesEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/identificationtypes")
public class IdentificationTypesController extends BaseController {

    @Cacheable("identificationTypes")
    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<IdentificationTypesEntity> get() {
        return (List<IdentificationTypesEntity>) identificationTypesRepository.findAll();
    }
}
