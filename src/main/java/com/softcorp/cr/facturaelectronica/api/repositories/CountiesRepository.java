

package com.softcorp.cr.facturaelectronica.api.repositories;

import com.softcorp.cr.facturaelectronica.api.entities.CountiesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.ProvincesEntity;
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
public interface CountiesRepository extends CrudRepository<CountiesEntity, Integer> {
    @Query(value = "SELECT * FROM counties WHERE province_id=?1",
            nativeQuery = true)
    List<CountiesEntity> getByProvinceId(@Param("provinceId") int provinceId);
}
