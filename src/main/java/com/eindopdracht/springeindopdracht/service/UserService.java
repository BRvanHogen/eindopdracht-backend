package com.eindopdracht.springeindopdracht.service;

import com.eindopdracht.springeindopdracht.model.UserAccount;
import org.springframework.security.core.userdetails.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    public List<UserAccount> getAllUsers();

    public abstract Optional<User> getUser(String username);

    String createUserAccount(UserAccount userAccount);
}
