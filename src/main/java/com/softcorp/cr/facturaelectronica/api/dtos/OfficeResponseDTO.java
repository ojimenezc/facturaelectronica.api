/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.dtos;

import com.softcorp.cr.facturaelectronica.api.entities.OfficesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.PointOfSaleEntity;

import java.util.List;

public class OfficeResponseDTO {

    public OfficesEntity office;
    public List<PointOfSaleEntity> pointsOfSale;

    public OfficesEntity getOffice() {
        return office;
    }

    public void setOffice(OfficesEntity office) {
        this.office = office;
    }

    public List<PointOfSaleEntity> getPointsOfSale() {
        return pointsOfSale;
    }

    public void setPointsOfSale(List<PointOfSaleEntity> pointsOfSale) {
        this.pointsOfSale = pointsOfSale;
    }
}
