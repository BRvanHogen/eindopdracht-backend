package com.eindopdracht.springeindopdracht.service;

import com.eindopdracht.springeindopdracht.model.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    //foutmelding: deze methode moest worden ingevoerd
    @Override
    public UserDetails loadUserByUsername(String username) {
        Optional<User> user = userService.getUser(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        String password = user.get().getPassword();

        Collection<GrantedAuthority> authorities = user.get().getAuthorities(); //dit is collection geworden en grantedAuthority
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (GrantedAuthority authority: authorities) {     //dit is grantedAUthority geworden. Ben op foutmeldingen afgegaan
            grantedAuthorities.add(new SimpleGrantedAuthority(authority.getAuthority()));
        }
        return new org.springframework.security.core.userdetails.User(username, password, grantedAuthorities);
    }
}