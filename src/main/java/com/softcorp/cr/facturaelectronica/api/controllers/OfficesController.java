
package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.dtos.OfficeResponseDTO;
import com.softcorp.cr.facturaelectronica.api.entities.OfficesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.PointOfSaleEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Configuration
@RestController
@RequestMapping("api/offices")
public class OfficesController extends BaseController {

    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<OfficeResponseDTO> get(int companyId) {
        try {

            List<OfficesEntity> offices = officesRepository.getByCompany(companyId);
            List<OfficeResponseDTO> response = new ArrayList<>();

            offices.stream().forEach(office -> {
                OfficeResponseDTO responseDTO = new OfficeResponseDTO();
                responseDTO.setOffice(office);
                responseDTO.setPointsOfSale(pointOfSalesRepository.getByOfficeId(office.getId()));
                response.add(responseDTO);
            });

            return response;
        } catch (Exception e) {
            loggerService.error(e.getMessage());
            throw e;
        }
    }
}
