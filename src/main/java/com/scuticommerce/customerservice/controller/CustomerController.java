package com.scuticommerce.customerservice.controller;

import com.scuticommerce.customerservice.service.CustomerService;
import com.scuticommerce.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value="/api/customerservice/")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value="/status")
    public ResponseEntity<?> up(){

        return new ResponseEntity<>( HttpStatus.OK);
    }

    @GetMapping(value="/customers")
    public ResponseEntity<?> findAllCustomes(){

        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }

    @PostMapping(value="/create")
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer){

        return new ResponseEntity<>(customerService.save(customer), HttpStatus.OK);
    }
}