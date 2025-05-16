package com.data.sesson09_webjava.service;

import com.data.sesson09_webjava.model.Customer;
import com.data.sesson09_webjava.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepo = new CustomerRepository();

    public Customer login(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            return null;
        }
        return customerRepo.checkLogin(username, password);
    }
}
