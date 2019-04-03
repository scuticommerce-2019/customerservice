package com.scuticommerce.customerservice.repository;

import com.scuticommerce.model.customer.Customer;
import com.scuticommerce.model.customer.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
