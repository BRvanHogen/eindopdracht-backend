package com.eindopdracht.springeindopdracht.service;


import com.eindopdracht.springeindopdracht.model.Project;
import java.util.List;

//in deze klasse benoem je wat je wilt doen met de projecten

public interface ProjectService {
    public List<Project> getAllProjects();
    public void save(Project project);
    public void deleteById(long id);
    public Project getProjectById(long id);
}
