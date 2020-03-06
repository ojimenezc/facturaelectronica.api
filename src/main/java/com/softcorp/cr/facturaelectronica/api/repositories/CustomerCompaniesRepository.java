

package com.softcorp.cr.facturaelectronica.api.repositories;

import com.softcorp.cr.facturaelectronica.api.entities.CustomerCompanyEntity;
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
public interface CustomerCompaniesRepository extends CrudRepository<CustomerCompanyEntity, Integer> {

    @Query(value = "SELECT * FROM customer_companies cc WHERE cc.company_id=?1", nativeQuery = true)
    public List<CustomerCompanyEntity> getLinksToDelete(@Param("companyId") int companyId);
}
