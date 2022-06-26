package org.fasttrack.reports.service.controller;

import lombok.RequiredArgsConstructor;
import org.fasttrack.reports.service.service.ReportService;
import org.fasttrackit.restaurant.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reports/restaurants")
@RequiredArgsConstructor
public class ReportController {

    private final ReportService service;

    @GetMapping
    Restaurant getPersons(){
        return service.getRestaurants().orElse(null);
    }
}