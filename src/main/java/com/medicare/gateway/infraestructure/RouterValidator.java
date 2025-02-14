package com.medicare.gateway.infraestructure;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouterValidator {

    // Lista de endpoints públicos
    public static final List<String> openApiEndpoints = List.of(
            "/auth/register", "/auth/login2", "/auth/login", "/medicine/teste"
    );

    public Predicate<ServerHttpRequest> isSecured =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().equals(uri));
}

