package com.hyperbench.hyperbench.springboot.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data

public class User {

    @NotNull
    private Long id;
    private String name;
    private Integer age;


}
