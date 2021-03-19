package com.eindopdracht.springeindopdracht.controller;

import com.eindopdracht.springeindopdracht.model.Dashboard;
import com.eindopdracht.springeindopdracht.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping(value = "/dashboard")
    public ResponseEntity<Object> getDashboards() {
        List<Dashboard> dashboards = dashboardService.getALlDashboards();
        return new ResponseEntity<>(dashboards, HttpStatus.OK);
    }

}
