package com.codestates.lecturedomain.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Lecture {
    private int id;
    private int lecturer_id;
    private boolean display_status;
    private String title;
}
