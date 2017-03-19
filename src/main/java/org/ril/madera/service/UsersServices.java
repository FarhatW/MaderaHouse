package org.ril.madera.service;

import org.ril.madera.model.Users;
import org.ril.madera.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service("UsersService")
public class UsersServices {

    @Autowired
    UsersRepository usersRepository;

    @Transactional
    public List<Users> getAll() {
        List<Users> countries = new ArrayList<Users>();
        Iterable<Users> countriesIterable = usersRepository.findAll();
        Iterator<Users> countriesIterator = countriesIterable.iterator();
        while (countriesIterator.hasNext()) {
            countries.add(countriesIterator.next());
        }
        return countries;
    }

    @Transactional
    public Users getById(int id) {
        return usersRepository.findOne(id);
    }

    @Transactional
    public Users getByEmail(String email) {
        return usersRepository.getUserByEmail(email);
    }

    @Transactional
    public List<Users> getClients() {
        List<Users> listClients = new ArrayList<Users>();
        for (Users user : usersRepository.findAll()) {
            if(user.getGroup() != null && "CLIENT".equals(user.getGroup().getNom().toUpperCase())) {
                listClients.add(user);
            }
        }
        return listClients;
    }

    @Transactional
    public void add(Users object) {
        usersRepository.save(object);
    }

    @Transactional
    public void update(Users object) {
        usersRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        usersRepository.delete(id);
    }


}
