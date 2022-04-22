package com.codestates.boarddomain.services;

import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Mono;

public interface BoardService {
    Mono<Lecture> getArticleList(ServerRequest serverRequest);
    Mono<Lecture> getArticle(ServerRequest serverRequest);
    Mono<Lecture> postArticle(ServerRequest serverRequest);
    Mono<Lecture> patchArticleVisibility(ServerRequest serverRequest);
    Mono<Lecture> getArticleComment(ServerRequest serverRequest);
    Mono<Lecture> postArticleComment(ServerRequest serverRequest);
    Mono<Lecture> patchCommentVisibility(ServerRequest serverRequest);
}
