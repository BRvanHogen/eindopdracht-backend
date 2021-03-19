package com.eindopdracht.springeindopdracht.model;

import javax.persistence.*;

@Entity
public class BandAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //zet hier geen ; achter. Heel belangrijk.
    long id;

    //attributes
    @Column
    String accountName;
    @Column
    String password;



    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

