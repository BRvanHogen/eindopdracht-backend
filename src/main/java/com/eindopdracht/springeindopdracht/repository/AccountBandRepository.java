package com.eindopdracht.springeindopdracht.repository;

import com.eindopdracht.springeindopdracht.model.BandAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountBandRepository extends JpaRepository <BandAccount, Long> {
}
