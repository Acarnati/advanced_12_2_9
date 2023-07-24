package com.example.testreactive.service;

import java.util.UUID;

import com.example.testreactive.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final WebClient webClient;
    static final String USER_URL_TEMPLATE = "/api/user/{id}";
    static final String USERS_URL_TEMPLATE = "/api/users";

    public Mono<User> getUserByIdAsync(final UUID id) {
        return webClient.get()
                .uri(USER_URL_TEMPLATE, id)
                .retrieve()
                .bodyToMono(User.class);
    }

    public Flux<User> findAll() {
        return webClient.get()
                .uri(USERS_URL_TEMPLATE)
                .retrieve()
                .bodyToFlux(User.class);
    }
}
