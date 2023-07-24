package com.example.testreactive;

import com.example.testreactive.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@AllArgsConstructor
public class TestReactiveApp implements CommandLineRunner {
    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(TestReactiveApp.class, args);
    }

    @Override
    public void run(final String... args) {
        userService.findAll()
                .map(user -> {
                    log.info("Find all users: {}", user);
                    return user;
                })
                .last()
                .flatMap(user -> userService
                        .getUserByIdAsync(user.getId()))
                .subscribe(user -> log.info("Get last user: {}", user));
    }
}
