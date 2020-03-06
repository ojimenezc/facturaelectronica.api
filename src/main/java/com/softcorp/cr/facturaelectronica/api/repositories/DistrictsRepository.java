

package com.softcorp.cr.facturaelectronica.api.repositories;

import com.softcorp.cr.facturaelectronica.api.entities.CountiesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.DistrictEntity;
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
public interface DistrictsRepository extends CrudRepository<DistrictEntity, Integer> {
    @Query(value = "SELECT * FROM districts WHERE county_id=?1 AND province_code=?2",
            nativeQuery = true)
    List<DistrictEntity> getByCountyAndProvinceId(@Param("countyId") int countyId,@Param("provinceCode") int provinceCode);
}
