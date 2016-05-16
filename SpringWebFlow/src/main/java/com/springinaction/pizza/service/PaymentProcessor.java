package com.springinaction.pizza.service;

import com.springinaction.pizza.PaymentException;

/**
 * Created by KL on 2016/5/15.
 */
public class PaymentProcessor {
    public PaymentProcessor() {
    }

    public void approveCreditCard(String creditCardNumber, String expMonth,
                                  String expYear, float amount) throws PaymentException {
        if (amount > 20.0) {
            throw new PaymentException();
        }
    }
}
