/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.repositories;

import com.softcorp.cr.facturaelectronica.api.entities.CustomersEntity;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan("com.softcorp.cr.facturaelectronica.api.repositories")
@Repository
public interface CustomersRepository extends CrudRepository<CustomersEntity, Integer> {
    @Query(value = "SELECT * FROM customers c WHERE c.username=?1 AND c.password=?2"
            , nativeQuery = true)
    CustomersEntity getByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
