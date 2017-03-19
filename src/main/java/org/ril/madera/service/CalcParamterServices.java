package org.ril.madera.service;

import org.ril.madera.model.CalcParameter;
import org.ril.madera.repository.CalcParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("CalcParamterServices")
public class CalcParamterServices {

    @Autowired
    CalcParameterRepository calcParameterRepository;

    @Transactional
    public List<CalcParameter> getAll() {
        List<CalcParameter> calcParameters = new ArrayList<CalcParameter>();
        Iterable<CalcParameter> calcParameterIterable = calcParameterRepository.findAll();
        Iterator<CalcParameter> parameterIterator = calcParameterIterable.iterator();
        while (parameterIterator.hasNext()) {
            calcParameters.add(parameterIterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public CalcParameter getById(int id) {
        return calcParameterRepository.findOne(id);
    }


    @Transactional
    public void add(CalcParameter object) {
        calcParameterRepository.save(object);
    }

    @Transactional
    public void update(CalcParameter object) {
        calcParameterRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        calcParameterRepository.delete(id);
    }


}
