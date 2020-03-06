/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.repositories;

import com.softcorp.cr.facturaelectronica.api.entities.CustomersEntity;
import com.softcorp.cr.facturaelectronica.api.entities.OfficesEntity;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Configuration
@ComponentScan("com.softcorp.cr.facturaelectronica.api.repositories")
@Repository
public interface OfficesRepository extends CrudRepository<OfficesEntity, Integer> {

    @Query(value = "select * from offices o where o.company_id=?1", nativeQuery = true)
    List<OfficesEntity> getByCompany(@Param("companyId") int companyId);

}
