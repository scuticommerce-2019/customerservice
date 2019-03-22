package com.scuticommerce.customerservice.service;

import com.scuticommerce.customerservice.repository.CustomerRepository;
import com.scuticommerce.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    public List<Customer> findAll(){

        return repository.findAll();
    }

    public Customer save(Customer customer) {

        return repository.save(customer);
    }
}
