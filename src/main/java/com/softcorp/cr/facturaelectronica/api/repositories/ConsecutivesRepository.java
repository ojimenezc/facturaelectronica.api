/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.repositories;

import com.softcorp.cr.facturaelectronica.api.entities.ConsecutivesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.CustomersEntity;
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
public interface ConsecutivesRepository extends CrudRepository<ConsecutivesEntity, Integer> {
    @Query(value = "select * from consecutives c where c.company_id=?1 and c.document_type=?4 and c.pos_id=?3 and c.office_id=?2",
            nativeQuery = true)
    ConsecutivesEntity getCurrentConsecutiveInformation(@Param("companyId") int companyId, @Param("officeID") int officeId, @Param("posId") int posID, @Param("documentType") int documentType);

    @Query(value = "select * from consecutives c where c.company_id=?1 and office_id=?2 and pos_id=?3",
            nativeQuery = true)
    List<ConsecutivesEntity> getCompanyConsecutives(@Param("companyId") int companyId, @Param("officeId") int officeId, @Param("posId") int posId);
}
