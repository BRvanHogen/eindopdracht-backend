package com.eindopdracht.springeindopdracht.service;

import com.eindopdracht.springeindopdracht.model.BandAccount;
import com.eindopdracht.springeindopdracht.repository.AccountBandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountBandServiceImpl implements AccountBandService {

    @Autowired
    private AccountBandRepository accountBandRepository;

//methods
    @Override
    public List<BandAccount> getAllAccountBands() {
        return accountBandRepository.findAll();
    }
}
