package com.springincation.pizza.domain;

/**
 * Created by KL on 2016/5/15.
 */
public class CashOrCheckPayment extends Payment {
    public CashOrCheckPayment(){}

    public String toString() {
        return "CASH or CHECK: $" + getAmount();
    }
}
