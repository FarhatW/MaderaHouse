package org.ril.madera.repository;

import org.ril.madera.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryCountry extends  CrudRepository<Country,Integer> {
    
}