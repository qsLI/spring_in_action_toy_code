package com.springincation.pizza.service;

/**
 * Created by KL on 2016/5/15.
 */
public class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException() {
    }

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
