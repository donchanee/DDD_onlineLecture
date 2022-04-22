package com.codestates.lecturedomain.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Matching {
    private int id;
    private int lecturer_id;
    private int lecture_id;
    private boolean lecture_available;
}
