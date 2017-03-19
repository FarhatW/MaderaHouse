package org.ril.madera.service;

import org.ril.madera.model.Component;
import org.ril.madera.model.Component;
import org.ril.madera.repository.ComponentFamilyRepository;
import org.ril.madera.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("ComponentServices")
public class ComponentServices {

    @Autowired
    ComponentRepository componentRepository;

    @Transactional
    public List<Component> getAll() {
        List<Component> calcParameters = new ArrayList<Component>();
        Iterable<Component> componentIterable = componentRepository.findAll();
        Iterator<Component> componentIterator = componentIterable.iterator();
        while (componentIterator.hasNext()) {
            calcParameters.add(componentIterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public Component getById(int id) {
        return componentRepository.findOne(id);
    }


    @Transactional
    public void add(Component object) {
        componentRepository.save(object);
    }

    @Transactional
    public void update(Component object) {
        componentRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        componentRepository.delete(id);
    }
}
