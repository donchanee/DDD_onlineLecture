package com.codestates.userdomain.services;

import com.codestates.userdomain.domain.User;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> createUser(ServerRequest serverRequest);
    Mono<User> loginUser(ServerRequest serverRequest);
    Mono<User> giveLecturerPermission(ServerRequest serverRequest);
}
