package com.codestates.lecturedomain.routers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class LectureRouter {

    public RouterFunction<ServerResponse> routers(LectureHandler lectureHandler) {
        return RouterFunctions.route()
                .path("/lecture", builder -> builder
                        // 강의목록 전부 가져오기
                        .GET("", lectureHandler::getLectureList)
                        // 개별 강의 가져오기
                        .GET("/{id}", lectureHandler::getLecture)
                        // 개별 강의 노출 여부 수정
                        .PATCH("/{id}/visible", lectureHandler::modifyLectureVisibility)
                        // 강의 컨텐츠 리스트 조회하기
                        .GET("/{id}/contents", lectureHandler::getContentList)
                        // 강의 개별 컨텐츠 조회하기
                        .GET("/{id}/contents/{contentPk}", lectureHandler::getContent)
                        // 강의 컨텐츠 등록하기
                        .POST("/{id}/contents", lectureHandler::postContent)

                        // 강의 별점 조회하기
                        .GET("/{id}/evaluate", lectureHandler::getEvaluateList)
                        // 강의 별점 남기기
                        .POST("/{id}/evaluate/{studentPk}", lectureHandler::postEvaluate)

                        // 개별 강의 수강신청하기
                        .POST("/{id}/application", lectureHandler::postApplication)
                        // 개별 강의 강사매칭하기
                        .POST("/{id}/match", lectureHandler::matchLecturer)
                )
                .build();
    }

}