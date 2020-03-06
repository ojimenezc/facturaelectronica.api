/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.repositories;

import com.softcorp.cr.facturaelectronica.api.entities.ClientEntity;
import com.softcorp.cr.facturaelectronica.api.entities.CompaniesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.CustomerClientEntity;
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
public interface ClientsRepository extends CrudRepository<ClientEntity, Integer> {

    @Query(value = "SELECT clients.* FROM clients INNER JOIN customer_clients  WHERE clients.id=customer_clients.client_id AND customer_clients.api_customer_id=?1"
            , nativeQuery = true)
    List<ClientEntity> getByCustomerId(@Param("customerId") int customerId);

    @Query(value = "SELECT clients.* FROM clients WHERE clients.id=?1"
            , nativeQuery = true)
    ClientEntity getByClientId(@Param("customerId") int customerId);
}
