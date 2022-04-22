package com.codestates.userdomain.routers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class UserRouter {

    public RouterFunction<ServerResponse> routers(UserHandler userHandler) {
        return RouterFunctions.route()
                .path("/auth", builder -> builder
                        // 회원가입
                        .POST("/signup", userHandler::createUser)
                        // 로그인
                        .POST("/login", userHandler::loginUser)
                        // 강사 권한 부여
                        .POST("/login", userHandler::giveLecturerPermission)
                )
                .build();
    }
}
