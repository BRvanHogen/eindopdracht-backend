package com.eindopdracht.springeindopdracht.service;

import com.eindopdracht.springeindopdracht.model.UserAccount;
import com.eindopdracht.springeindopdracht.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserAccount> getAllUsers() {
        return userRepository.findAll();
    }
}
