package com.codestates.lecturedomain.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    private int id;
    private int lecture_id;
    private int student_id;
}
