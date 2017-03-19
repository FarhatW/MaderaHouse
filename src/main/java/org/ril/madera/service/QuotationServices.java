package org.ril.madera.service;

import org.ril.madera.model.Quotation;
import org.ril.madera.repository.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("QuotationServices")
public class QuotationServices {
    @Autowired
    QuotationRepository quotationRepository;

    @Transactional
    public List<Quotation> getAll() {
        List<Quotation> calcParameters = new ArrayList<Quotation>();
        Iterable<Quotation> iterable = quotationRepository.findAll();
        Iterator<Quotation> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            calcParameters.add(iterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public Quotation getById(int id) {
        return quotationRepository.findOne(id);
    }


    @Transactional
    public void add(Quotation object) {
        quotationRepository.save(object);
    }

    @Transactional
    public void update(Quotation object) {
        quotationRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        quotationRepository.delete(id);
    }
}
