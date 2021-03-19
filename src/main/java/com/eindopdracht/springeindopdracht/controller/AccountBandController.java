package com.eindopdracht.springeindopdracht.controller;

import com.eindopdracht.springeindopdracht.model.BandAccount;
import com.eindopdracht.springeindopdracht.service.AccountBandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountBandController {

    @Autowired
    private AccountBandService accountbandservice; //zonder @Service in klasse projectserviceimpl kreeg ik foutmelding

    @GetMapping(value = "/accountband")
    public ResponseEntity<Object> getAccountBands() {
        List<BandAccount> bandAccounts = accountbandservice.getAllAccountBands();
        return new ResponseEntity<>(bandAccounts, HttpStatus.OK);
    }
}
