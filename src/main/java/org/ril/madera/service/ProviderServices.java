package org.ril.madera.service;

import org.ril.madera.model.Provider;
import org.ril.madera.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("ProviderServices")
public class ProviderServices {

    @Autowired
    ProviderRepository providerRepository;

    @Transactional
    public List<Provider> getAll() {
        List<Provider> calcParameters = new ArrayList<Provider>();
        Iterable<Provider> iterable = providerRepository.findAll();
        Iterator<Provider> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            calcParameters.add(iterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public Provider getById(int id) {
        return providerRepository.findOne(id);
    }


    @Transactional
    public void add(Provider object) {
        providerRepository.save(object);
    }

    @Transactional
    public void update(Provider object) {
        providerRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        providerRepository.delete(id);
    }
}
