package com.eindopdracht.springeindopdracht.controller;


import com.eindopdracht.springeindopdracht.model.UserAccount;
import com.eindopdracht.springeindopdracht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

@Autowired
private UserService userService;

    @GetMapping(value = "/user")
    public ResponseEntity<Object> getUsers() {
        List<UserAccount> userAccounts = userService.getAllUsers();
        return new ResponseEntity<>(userAccounts, HttpStatus.OK);
    }
}
