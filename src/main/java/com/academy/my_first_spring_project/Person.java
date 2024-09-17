package com.academy.my_first_spring_project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Person {
    private Long id;
    private String name;


}




