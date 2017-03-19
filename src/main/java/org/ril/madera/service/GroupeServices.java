package org.ril.madera.service;

import org.ril.madera.model.Groupe;
import org.ril.madera.repository.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("GroupeServices")
public class GroupeServices {

    @Autowired
    GroupeRepository groupeRepository;

    @Transactional
    public List<Groupe> getAll() {
        List<Groupe> calcParameters = new ArrayList<Groupe>();
        Iterable<Groupe> groupeIterable = groupeRepository.findAll();
        Iterator<Groupe> groupeIterator = groupeIterable.iterator();
        while (groupeIterator.hasNext()) {
            calcParameters.add(groupeIterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public Groupe getById(int id) {
        return groupeRepository.findOne(id);
    }


    @Transactional
    public void add(Groupe object) {
        groupeRepository.save(object);
    }

    @Transactional
    public void update(Groupe object) {
        groupeRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        groupeRepository.delete(id);
    }
}
