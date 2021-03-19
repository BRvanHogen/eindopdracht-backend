package com.eindopdracht.springeindopdracht.repository;

import com.eindopdracht.springeindopdracht.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <UserAccount, Long> {

    List<UserAccount> findAllBy();
}
