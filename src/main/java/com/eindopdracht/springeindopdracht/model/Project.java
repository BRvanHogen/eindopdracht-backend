package com.eindopdracht.springeindopdracht.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity          //zorgt ervoor dat het automatisch in je db terecht komt
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //met deze twee regels voeg je ID (pk) toe
    long id;

    //attributes
    @Column
    String projectName;
    @Column
    LocalDate dateOfCreation;   //hier aparte methode now(); of zoiets voor?
    @Column
    String createdBy;



    //getters and setters
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

}
