package com.codestates.boarddomain.routers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class BoardRouter {
    public RouterFunction<ServerResponse> routers(BoardHandler boardHandler) {
        return RouterFunctions.route()
                .path("/board", builder -> builder
                        // 게시판 목록 가져오기
                        .GET("", boardHandler::getArticleList)
                        // 개별 게시글 가져오기
                        .GET("/{id}", boardHandler::getArticle)
                        // 개별 게시글 작성
                        .POST("/{id}", boardHandler::postArticle)
                        // 게시글 숨김처리
                        .PATCH("/{id}/visible", boardHandler::patchArticleVisibility)

                        // 개별 게시글 댓글 조회
                        .GET("/{id}/comment", boardHandler::getArticleComment)
                        // 개별 게시글 댓글 작성
                        .POST("/{id}/comment", boardHandler::postArticleComment)
                        // 댓글 숨김처리
                        .PATCH("/{id}/comment/visible", boardHandler::patchCommentVisibility)
                )
                .build();
    }
}
