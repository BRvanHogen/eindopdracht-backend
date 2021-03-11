package com.eindopdracht.springeindopdracht.service;

import com.eindopdracht.springeindopdracht.model.Project;
import com.eindopdracht.springeindopdracht.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();  //deze methode bestaat niet tot je projectrepo extends jparepo
    }

    @Override
    public void save(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void deleteById(long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project getProjectById(long id) {
        return projectRepository.findById(id).orElse(null); //maak hier nog even netjes throw exception record not found van
    }
}
