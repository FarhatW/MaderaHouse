package org.ril.madera.service;

import org.ril.madera.model.Module;
import org.ril.madera.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("ModuleServices")
public class ModuleServices {

    @Autowired
    ModuleRepository moduleRepository;

    @Transactional
    public List<Module> getAll() {
        List<Module> calcParameters = new ArrayList<Module>();
        Iterable<Module> iterable = moduleRepository.findAll();
        Iterator<Module> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            calcParameters.add(iterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public Module getById(int id) {
        return moduleRepository.findOne(id);
    }


    @Transactional
    public void add(Module object) {
        moduleRepository.save(object);
    }

    @Transactional
    public void update(Module object) {
        moduleRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        moduleRepository.delete(id);
    }
}
