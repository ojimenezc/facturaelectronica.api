/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.entities.ProductsEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductsController extends BaseController {

    @RequestMapping(value = "/save", method = RequestMethod.POST, headers = "Accept=application/json")
    public ProductsEntity save(@RequestBody ProductsEntity productsEntity) {
        try {
            return productsRepository.save(productsEntity);
        } catch (Exception e) {
            loggerService.error(e);
            return null;
        }
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public Iterable<ProductsEntity> get(int customerId) {
        try {
            return productsRepository.getByCustomer(customerId);
        } catch (Exception e) {
            loggerService.error(e.getMessage());
            return null;
        }
    }


    @RequestMapping(value = "/getsingle", method = RequestMethod.GET, headers = "Accept=application/json")
    public ProductsEntity getsingle(int id) {
        try {
            return productsRepository.getSingle(id);
        } catch (Exception e) {
            loggerService.error(e.getMessage());
            return null;
        }
    }
}