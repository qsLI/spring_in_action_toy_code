package com.springincation.pizza.service;

import com.springincation.pizza.domain.Customer;

/**
 * Created by KL on 2016/5/15.
 */
public interface CustomerService {
    Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}
