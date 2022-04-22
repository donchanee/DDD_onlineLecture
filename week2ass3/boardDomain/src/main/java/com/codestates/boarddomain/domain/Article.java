package com.codestates.boarddomain.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private int id;
    private int user_id;
    private String body;
    private boolean display_status;
}
