package org.fasttrack.reports.service.service;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.restaurant.client.resttemplate.RestaurantClientRT;
import org.fasttrackit.restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReportService {
    private final RestaurantClientRT client;

    public Optional<Restaurant> getRestaurants() {
        return client.restaurants().getRestaurants();
    }
}
