package org.ril.madera.service;

import org.ril.madera.model.State;
import org.ril.madera.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("StateServices")
public class StateServices {

    @Autowired
    StateRepository stateRepository;

    @Transactional
    public List<State> getAll() {
        List<State> calcParameters = new ArrayList<State>();
        Iterable<State> iterable = stateRepository.findAll();
        Iterator<State> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            calcParameters.add(iterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public State getById(int id) {
        return stateRepository.findOne(id);
    }


    @Transactional
    public void add(State object) {
        stateRepository.save(object);
    }

    @Transactional
    public void update(State object) {
        stateRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        stateRepository.delete(id);
    }
}
