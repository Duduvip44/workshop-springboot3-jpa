package com.curso.course.resources;

import com.curso.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
    User u = new User(1L,"Maria","Sousa@gmail.com","9999","123");

    return ResponseEntity.ok().body(u);
    };

}
