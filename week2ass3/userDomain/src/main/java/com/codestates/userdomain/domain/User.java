package com.codestates.userdomain.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String user_type;
    private int name;
    private int email;
}
