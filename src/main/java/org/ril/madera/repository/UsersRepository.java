package org.ril.madera.repository;

import org.ril.madera.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends  CrudRepository<Users,Integer> {

    public Users getUserByEmail(String email);
}