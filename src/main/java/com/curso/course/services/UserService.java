package com.curso.course.services;

import com.curso.course.entities.User;
import com.curso.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> FindAll(){
        return repository.findAll();
    }

    public User findById(long id)
    {
        Optional<User> obj =  repository.findById(id);
        //Se achar o usuário retorna o mesmo, se não o retorno será null
        return obj.orElse(null);
    }
}
