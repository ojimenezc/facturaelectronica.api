/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.softcorp.cr.facturaelectronica.api.dtos.ClientIDPLoginDTO;
import com.softcorp.cr.facturaelectronica.api.dtos.CreateIDPUserRequestDTO;
import com.softcorp.cr.facturaelectronica.api.entities.CustomerCompanyEntity;
import com.softcorp.cr.facturaelectronica.api.entities.CustomersEntity;
import com.softcorp.cr.facturaelectronica.api.entities.DocumentsEntity;
import com.softcorp.cr.facturaelectronica.api.helpers.UsersHelper;
import com.softcorp.cr.facturaelectronica.api.security.encription.Encrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@RestController
@RequestMapping("api/customers")
public class CustomerController extends BaseController {
    @Autowired
    UsersHelper usersHelper;

    @RequestMapping(value = "/save", method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity<CustomersEntity> create(@RequestBody CustomersEntity customersEntity, HttpServletRequest request) throws JsonProcessingException {
        try {
            CreateIDPUserRequestDTO createIDPUserRequestDTO = new CreateIDPUserRequestDTO();
            createIDPUserRequestDTO.setEmail(customersEntity.getRepresentativeEmail());
            createIDPUserRequestDTO.setName(customersEntity.getRepresentativeName());
            createIDPUserRequestDTO.setPassword(customersEntity.getPassword());
            Boolean userCreatedInIDP = true;

            // userCreatedInIDP = usersHelper.createUserInIDP(createIDPUserRequestDTO, request.getHeader("authorization"));

            if (userCreatedInIDP) {
                Encrypter encrypter = new Encrypter();
                customersEntity.setPassword(encrypter.encrypt(customersEntity.getPassword()));
                customersEntity.setUsername(encrypter.encrypt(customersEntity.getUsername()));
                customersRepository.save(customersEntity);
                customersEntity.setPassword(null);
                customersEntity.setBiometrics(null);
                return ResponseEntity.ok(customersEntity);
            } else {
                loggerService.error("The user could not be created in IDP [" + customersEntity.getRepresentativeEmail() + "]");
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "The user could not be created in IDP [" + customersEntity.getRepresentativeEmail() + "]");
            }
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    @RequestMapping(value = "/linkcompany", method = RequestMethod.POST, headers = "Accept=application/json")
    public CustomerCompanyEntity linkCompany(@RequestBody CustomerCompanyEntity customersEntity) {
        customerCompaniesRepository.save(customersEntity);
        return customersEntity;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET, headers = "Accept=application/json")
    public Object login(String username, String password) throws JsonProcessingException {
        try {
            ClientIDPLoginDTO clientIDPLoginDTO = new ClientIDPLoginDTO();
            clientIDPLoginDTO.setGrantType("password");
            clientIDPLoginDTO.setPassword(password);
            clientIDPLoginDTO.setUsername(username);
            return usersHelper.loginClientInIDP(clientIDPLoginDTO);
        } catch (Exception e) {
            loggerService.error("Error login in user " + e.getMessage());
            throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "Error login in user");
        }
    }
}
