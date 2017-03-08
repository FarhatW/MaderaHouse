package org.ril.madera.repository;

import org.ril.madera.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryUser extends  CrudRepository<Users,Integer> {

    public Users getUserByEmail(String email);
}