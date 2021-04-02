package com.eindopdracht.springeindopdracht.controller;


import com.eindopdracht.springeindopdracht.model.UserAccount;
import com.eindopdracht.springeindopdracht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

@Autowired
private UserService userService;


@GetMapping(value = "/info")
public ResponseEntity<Object> getInfo() {
    return new ResponseEntity<>("/info endpoint available to all", HttpStatus.OK);
}

    @GetMapping(value = "/user")
    public ResponseEntity<Object> getUsers() {
        List<UserAccount> userAccounts = userService.getAllUsers();
        return new ResponseEntity<>(userAccounts, HttpStatus.OK);
    }

    @GetMapping(value = "/{username}")
    public ResponseEntity<Object> getUser(@PathVariable("username") String username) {
        return ResponseEntity.ok().body(userService.getUser(username));
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> createUser(@RequestBody UserAccount userAccount) {
        String newUsername = userService.createUserAccount(userAccount);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{username}")
                .buildAndExpand(newUsername).toUri();

        return ResponseEntity.created(location).build();
    }
}
