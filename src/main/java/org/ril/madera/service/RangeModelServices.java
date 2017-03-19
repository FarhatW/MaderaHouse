package org.ril.madera.service;

import org.ril.madera.model.RangeModel;
import org.ril.madera.repository.RangeModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("RangeModelServices")
public class RangeModelServices {

    @Autowired
    RangeModelRepository rangeModelRepository;

    @Transactional
    public List<RangeModel> getAll() {
        List<RangeModel> calcParameters = new ArrayList<RangeModel>();
        Iterable<RangeModel> iterable = rangeModelRepository.findAll();
        Iterator<RangeModel> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            calcParameters.add(iterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public RangeModel getById(int id) {
        return rangeModelRepository.findOne(id);
    }


    @Transactional
    public void add(RangeModel object) {
        rangeModelRepository.save(object);
    }

    @Transactional
    public void update(RangeModel object) {
        rangeModelRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        rangeModelRepository.delete(id);
    }
}
