package sgr.cost.expenses.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sgr.cost.expenses.entity.User;

import java.util.UUID;

public interface UserService {

    Flux<User> getAllUsers();
    Mono<User> getUserById(UUID id);

}
