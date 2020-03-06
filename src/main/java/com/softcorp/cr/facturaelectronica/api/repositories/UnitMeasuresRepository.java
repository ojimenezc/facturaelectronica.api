

package com.softcorp.cr.facturaelectronica.api.repositories;

import com.softcorp.cr.facturaelectronica.api.entities.TaxesEntity;
import com.softcorp.cr.facturaelectronica.api.entities.UnitMeasureEntity;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan("com.softcorp.cr.facturaelectronica.api.repositories")
@Repository
public interface UnitMeasuresRepository extends CrudRepository<UnitMeasureEntity, Integer> {

}
