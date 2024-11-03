package com.medicare.gateway.infraestructure;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationGateway {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("medicine", r -> r.path("/medicine/**")
                        .uri("http://localhost:8082/"))
                .route("user", r -> r.path("/auth/**")
                        .uri("http://localhost:8081/"))
                .build();
    }
}

