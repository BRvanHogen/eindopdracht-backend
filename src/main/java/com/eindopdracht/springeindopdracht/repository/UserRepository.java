package com.eindopdracht.springeindopdracht.repository;

import com.eindopdracht.springeindopdracht.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository <UserAccount, Long> {

    List<UserAccount> findAllBy();

    Optional<User> findById(String username);
}
