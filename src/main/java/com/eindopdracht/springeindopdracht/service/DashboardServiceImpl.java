package com.eindopdracht.springeindopdracht.service;

import com.eindopdracht.springeindopdracht.model.Dashboard;
import com.eindopdracht.springeindopdracht.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private DashboardRepository dashboardRepository;

    //methods
    @Override
    public List<Dashboard> getALlDashboards() {
        return dashboardRepository.findAll();
    }
}
