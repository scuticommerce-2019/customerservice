package com.scuticommerce.customerservice.repository;

import com.scuticommerce.model.customer.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,String> {

}
