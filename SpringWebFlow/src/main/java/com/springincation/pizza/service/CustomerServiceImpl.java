package com.springincation.pizza.service;

import com.springincation.pizza.domain.Customer;

/**
 * Created by KL on 2016/5/15.
 */
public class CustomerServiceImpl implements CustomerService {
    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        if ("9725551234".equalsIgnoreCase(phoneNumber)) {
            Customer customer = new Customer();
            customer.setId(123);
            customer.setName("Craig Walls");
            customer.setAddress("3700 Dunlavy Rd");
            customer.setCity("Denton");
            customer.setState("TX");
            customer.setZipCode("76210");
            customer.setPhoneNumber(phoneNumber);
            return customer;
        } else {
            throw new CustomerNotFoundException();
        }
    }
}
