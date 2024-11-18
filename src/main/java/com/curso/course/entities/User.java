package com.curso.course.entities;

import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}


