package org.ril.madera.service;

import org.ril.madera.model.Range;
import org.ril.madera.repository.RangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("RangeServices")
public class RangeServices {

    @Autowired
    RangeRepository rangeRepository;

    @Transactional
    public List<Range> getAll() {
        List<Range> calcParameters = new ArrayList<Range>();
        Iterable<Range> iterable = rangeRepository.findAll();
        Iterator<Range> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            calcParameters.add(iterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public Range getById(int id) {
        return rangeRepository.findOne(id);
    }


    @Transactional
    public void add(Range object) {
        rangeRepository.save(object);
    }

    @Transactional
    public void update(Range object) {
        rangeRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        rangeRepository.delete(id);
    }
}
