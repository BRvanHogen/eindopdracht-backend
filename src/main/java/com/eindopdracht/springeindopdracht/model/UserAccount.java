package com.eindopdracht.springeindopdracht.model;

import javax.persistence.*;

@Entity
@Table(name = "user_account")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    //attributes
    @Column (nullable = false, unique = true)
    String username;
    @Column (nullable = false)
    String password;
    @Column
    String email;
    @Column (nullable = false)
    boolean enabled = true;
    @Column
    private String apikey;


//getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }





    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }
}
