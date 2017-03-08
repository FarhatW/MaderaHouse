package org.ril.madera.service;

import org.ril.madera.model.Users;
import org.ril.madera.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service("UsersService")
public class ServicesUser {

    @Autowired
    RepositoryUser repositoryUser;

    @Transactional
    public List<Users> getAll() {
        List<Users> countries = new ArrayList<Users>();
        Iterable<Users> countriesIterable = repositoryUser.findAll();
        Iterator<Users> countriesIterator = countriesIterable.iterator();
        while (countriesIterator.hasNext()) {
            countries.add(countriesIterator.next());
        }
        return countries;
    }

    @Transactional
    public Users getById(int id) {
        return repositoryUser.findOne(id);
    }

    @Transactional
    public Users getByEmail(String email) {
        return repositoryUser.getUserByEmail(email);
    }

    @Transactional
    public void add(Users object) {
        repositoryUser.save(object);
    }

    @Transactional
    public void update(Users object) {
        repositoryUser.save(object);

    }

    @Transactional
    public void delete(int id) {
        repositoryUser.delete(id);
    }
}
