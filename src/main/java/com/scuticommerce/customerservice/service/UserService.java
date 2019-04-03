package com.scuticommerce.customerservice.service;

import com.scuticommerce.customerservice.repository.UserRepository;
import com.scuticommerce.model.customer.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll(){

        return repository.findAll();
    }

    public User save(User user) {

        return repository.save(user);
    }
}
