

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.dtos.ClientRequestDto;
import com.softcorp.cr.facturaelectronica.api.entities.ClientEntity;
import com.softcorp.cr.facturaelectronica.api.entities.CustomerClientEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/clients")
public class ClientsController extends BaseController {

    @RequestMapping(value = "/save", method = RequestMethod.POST, headers = "Accept=application/json")
    public ClientEntity save(@RequestBody ClientRequestDto newClient) {
        try {
            boolean isUpdate = newClient.getClient().getId() > 0;
            ClientEntity newClientSaved = clientsRepository.save(newClient.getClient());

            if (null != newClientSaved && newClientSaved.getId() > 0 && !isUpdate) {
                CustomerClientEntity customerClientEntity = new CustomerClientEntity();
                customerClientEntity.setApiCustomerId(newClient.getCustomer());
                customerClientEntity.setClientID(newClientSaved.getId());
                customersClientRepository.save(customerClientEntity);
            }

            return newClientSaved;
        } catch (Exception e) {
            loggerService.error(e);
            return null;
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, headers = "Accept=application/json")
    public ClientEntity update(@RequestBody ClientRequestDto newClient) {
        try {
            boolean isUpdate = newClient.getClient().getId() > 0;
            if (!isUpdate) {
                throw new IllegalStateException("The client id is null. To update the id is required");
            }
            Optional<ClientEntity> existing = clientsRepository.findById(newClient.getClient().getId());
            if (existing.isPresent()) {
                ClientEntity newClientSaved = clientsRepository.save(newClient.getClient());
                return newClientSaved;
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The client with id = " + newClient.getClient().getId() + " does not exist");
            }

        } catch (Exception e) {
            loggerService.error(e);
            return null;
        }
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<ClientEntity> get(int customerId) {
        try {
            return clientsRepository.getByCustomerId(customerId);
        } catch (Exception e) {
            loggerService.error(e);
            throw e;
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public boolean delete(int clientId) {
        try {
            ClientEntity clientToRemove = clientsRepository.getByClientId(clientId);
            if (null != clientToRemove) {
                clientsRepository.delete(clientToRemove);
                List<CustomerClientEntity> linksToDelete = customersClientRepository.getLinksToDelete(clientId);
                if (null != linksToDelete) {
                    customersClientRepository.deleteAll(linksToDelete);
                }
                return true;
            } else {
                loggerService.error("The client with id " + clientId + " was not found and could not be deleted");
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Client not found"
                );
            }
        } catch (Exception e) {
            loggerService.error(e.getMessage());
            throw e;
        }
    }
}
