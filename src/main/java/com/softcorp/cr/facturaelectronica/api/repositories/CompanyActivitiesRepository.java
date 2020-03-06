/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.repositories;

import com.softcorp.cr.facturaelectronica.api.entities.ClientEntity;
import com.softcorp.cr.facturaelectronica.api.entities.CompanyActivityEntity;
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
public interface CompanyActivitiesRepository extends CrudRepository<CompanyActivityEntity, Integer> {

    @Query(value = "SELECT * FROM company_activities WHERE company_id=?1"
            , nativeQuery = true)
    List<CompanyActivityEntity> getByCompany(@Param("companyId") int companyId);

    @Query(value = "SELECT * FROM company_activities WHERE company_id=?1 AND activity_code=?2", nativeQuery = true)
    CompanyActivityEntity getByCompanyAndCode(@Param("companyId") int companyId, @Param("code") String code);

}
