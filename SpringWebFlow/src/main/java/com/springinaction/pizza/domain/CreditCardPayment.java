package com.springinaction.pizza.domain;

/**
 * Created by KL on 2016/5/15.
 */
public class CreditCardPayment extends Payment {
    public CreditCardPayment() {
    }

    private String authorization;

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String toString() {
        return "Credit: $" + getAmount() + " ; AUTH: " + authorization;
    }
}
