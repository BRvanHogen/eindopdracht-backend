package com.eindopdracht.springeindopdracht.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(com.eindopdracht.springeindopdracht.model.AuthorityKey.class)
//alleen voor de @Table annotatie uitzoeken waar deze naar moet verwijzen
@Table(name = "authorities")
public class Authority implements Serializable {

    //check nog even of dit communiceert met UserAccount. Voor de zekerheid heb ik
    //alles herschreven met hoofdletter N.
    @Id
    @Column(nullable = false)
    private String username;

    @Id
    @Column(nullable = false)
    private String authority;

    public Authority() {
    }

    public Authority(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
