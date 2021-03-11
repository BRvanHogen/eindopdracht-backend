package com.eindopdracht.springeindopdracht.controller;

import com.eindopdracht.springeindopdracht.model.Project;
import com.eindopdracht.springeindopdracht.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService; //zonder @Service in klasse projectserviceimpl kreeg ik foutmelding

    @GetMapping(value = "/project")
    public ResponseEntity<Object> getProjects() {
        List<Project> projects = projectService.getAllProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @GetMapping(value = "/project/{id}")
    public ResponseEntity<Object> getProjectById(@PathVariable("id") long id) {
        return new ResponseEntity<>(projectService.getProjectById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/project")
    public ResponseEntity<Object> createProject(@RequestBody Project project) {
        projectService.save(project);
        return new ResponseEntity<>("project added", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/project/{id}")
    public ResponseEntity<Object> deleteProject(@PathVariable("id") long id) {
        projectService.deleteById(id);
        return new ResponseEntity<>("project deleted", HttpStatus.OK);
    }
}
