package com.eindopdracht.springeindopdracht.repository;

import com.eindopdracht.springeindopdracht.model.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DashboardRepository extends JpaRepository<Dashboard, Long> {

    List<Dashboard> findAllBy();
}
