package com.eindopdracht.springeindopdracht.service;

import com.eindopdracht.springeindopdracht.model.UserAccount;
import com.eindopdracht.springeindopdracht.repository.UserRepository;
import com.eindopdracht.springeindopdracht.utils.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements com.eindopdracht.springeindopdracht.service.UserService {

    @Autowired
    private UserRepository userRepository;

    private String getCurrentUserName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return ((UserDetails) authentication.getPrincipal()).getUsername();
    }

    @Override
    public List<UserAccount> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUser(String username) {
        return userRepository.findById(username);
    }

    @Override
    public String createUserAccount(UserAccount userAccount) {
        String randomString = RandomStringGenerator.generateAlphaNumeric(20);
        userAccount.setApikey(randomString);
        UserAccount newUser = userRepository.save(userAccount);
        return newUser.getUsername();
    }
}
