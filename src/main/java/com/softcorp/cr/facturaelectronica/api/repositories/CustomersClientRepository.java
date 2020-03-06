

package com.softcorp.cr.facturaelectronica.api.repositories;

import com.softcorp.cr.facturaelectronica.api.entities.ClientEntity;
import com.softcorp.cr.facturaelectronica.api.entities.CustomerClientEntity;
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
public interface CustomersClientRepository extends CrudRepository<CustomerClientEntity, Integer> {

    @Query(value = "SELECT customer_clients.* FROM customer_clients WHERE customer_clients.client_id=?1"
            , nativeQuery = true)
    List<CustomerClientEntity> getLinksToDelete(@Param("customerId") int customerId);
}
