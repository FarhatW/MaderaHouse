package org.ril.madera.service;

import org.ril.madera.model.Project;
import org.ril.madera.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gamer on 19/03/2017.
 */
@Service("ProjectServices")
public class ProjectServices {

    @Autowired
    ProjectRepository projectRepository;

    @Transactional
    public List<Project> getAll() {
        List<Project> calcParameters = new ArrayList<Project>();
        Iterable<Project> iterable = projectRepository.findAll();
        Iterator<Project> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            calcParameters.add(iterator.next());
        }
        return calcParameters;
    }

    @Transactional
    public Project getById(int id) {
        return projectRepository.findOne(id);
    }


    @Transactional
    public void add(Project object) {
        projectRepository.save(object);
    }

    @Transactional
    public void update(Project object) {
        projectRepository.save(object);

    }

    @Transactional
    public void delete(int id) {
        projectRepository.delete(id);
    }
}
