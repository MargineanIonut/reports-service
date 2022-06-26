package org.fasttrack.reports.service;

import org.fasttrackit.restaurant.client.resttemplate.config.RestaurantClientRTConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "org.fasttrackit.reports.service",
        "org.fasttrackit.restaurant.client.resttemplate"
})
@EnableConfigurationProperties(value = RestaurantClientRTConfig.class)
public class ReportsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportsServiceApplication.class, args);
    }

}
