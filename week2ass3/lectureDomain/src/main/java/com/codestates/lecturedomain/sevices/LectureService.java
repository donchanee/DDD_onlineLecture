package com.codestates.lecturedomain.sevices;

import com.codestates.lecturedomain.domain.Lecture;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Mono;

public interface LectureService {
    Mono<Lecture> getLectureList(ServerRequest serverRequest);
    Mono<Lecture> getLecture(ServerRequest serverRequest);
    Mono<Lecture> modifyLectureVisibility(ServerRequest serverRequest);
    Mono<Lecture> getContentList(ServerRequest serverRequest);
    Mono<Lecture> postContent(ServerRequest serverRequest);
    Mono<Lecture> getContent(ServerRequest serverRequest);
    Mono<Lecture> getEvaluateList(ServerRequest serverRequest);
    Mono<Lecture> postEvaluate(ServerRequest serverRequest);
    Mono<Lecture> postApplication(ServerRequest serverRequest);
    Mono<Lecture> matchLecturer(ServerRequest serverRequest);

}
