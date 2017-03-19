package org.ril.madera.service;

import org.ril.madera.model.City;
import org.ril.madera.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("CityServices")
public class CityServices {
    @Autowired
    CityRepository cityRepository;

    @Transactional
    public List<City> getAll() {
        List<City> calcParameters = new ArrayList<City>();
        Iterable<City> cityIterable = cityRepository.findAll();
        Iterator<City> cityIterator = cityIterable.iterator();
        while (cityIterator.hasNext()) {
            calcParameters.add(cityIterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public City getById(int id) {
        return cityRepository.findOne(id);
    }


    @Transactional
    public void add(City object) {
        cityRepository.save(object);
    }

    @Transactional
    public void update(City object) {
        cityRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        cityRepository.delete(id);
    }
}
