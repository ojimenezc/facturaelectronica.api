

package com.softcorp.cr.facturaelectronica.api.repositories;


import com.softcorp.cr.facturaelectronica.api.entities.EconomicActivityEntity;
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
public interface EconomicActivitiesRepository extends CrudRepository<EconomicActivityEntity, Integer> {
    @Query(value = "SELECT * FROM economic_activities LIMIT ?1,?2", nativeQuery = true)
    List<EconomicActivityEntity> getAllOffset(@Param("offset") int offset, @Param("pageSize") int pageSize);
}
