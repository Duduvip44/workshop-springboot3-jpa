package com.curso.course.services;

import com.curso.course.entities.Order;
import com.curso.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> FindAll(){
        return repository.findAll();
    }

    public Order findById(long id)
    {
        Optional<Order> obj =  repository.findById(id);
        //Se achar o usuário retorna o mesmo, se não o retorno será null
        return obj.orElse(null);
    }
}
