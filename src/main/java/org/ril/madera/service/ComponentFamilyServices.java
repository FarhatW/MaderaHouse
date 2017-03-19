package org.ril.madera.service;

import org.ril.madera.model.ComponentFamily;
import org.ril.madera.repository.ComponentFamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("ComponentFamilyServices")
public class ComponentFamilyServices {
    @Autowired
    ComponentFamilyRepository componentFamilyRepository;

    @Transactional
    public List<ComponentFamily> getAll() {
        List<ComponentFamily> calcParameters = new ArrayList<ComponentFamily>();
        Iterable<ComponentFamily> componentFamilyIterable = componentFamilyRepository.findAll();
        Iterator<ComponentFamily> componentFamilyIterator = componentFamilyIterable.iterator();
        while (componentFamilyIterator.hasNext()) {
            calcParameters.add(componentFamilyIterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public ComponentFamily getById(int id) {
        return componentFamilyRepository.findOne(id);
    }


    @Transactional
    public void add(ComponentFamily object) {
        componentFamilyRepository.save(object);
    }

    @Transactional
    public void update(ComponentFamily object) {
        componentFamilyRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        componentFamilyRepository.delete(id);
    }
}
