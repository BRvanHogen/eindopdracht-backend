package com.eindopdracht.springeindopdracht.model;

import javax.persistence.*;

@Entity
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    //attributes. Moet ik hier projecten toevoegen als attribuut, of importeer ik dat vanuit
    //project-klasse? Wat het lastig maakt, is feit dat het vaak om meerdere projecten gaat
    //en een array als attribuut opgeven niet mag.
    @Column
    String bandName;


    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
