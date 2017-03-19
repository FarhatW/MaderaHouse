package org.ril.madera.service;

import org.ril.madera.model.Site;
import org.ril.madera.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("SiteServices")
public class SiteServices {

    @Autowired
    SiteRepository siteRepository;

    @Transactional
    public List<Site> getAll() {
        List<Site> calcParameters = new ArrayList<Site>();
        Iterable<Site> iterable = siteRepository.findAll();
        Iterator<Site> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            calcParameters.add(iterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public Site getById(int id) {
        return siteRepository.findOne(id);
    }


    @Transactional
    public void add(Site object) {
        siteRepository.save(object);
    }

    @Transactional
    public void update(Site object) {
        siteRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        siteRepository.delete(id);
    }
}
