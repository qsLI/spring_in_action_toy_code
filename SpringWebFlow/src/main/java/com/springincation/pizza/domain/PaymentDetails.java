package com.springincation.pizza.domain;

import java.io.Serializable;

/**
 * Created by KL on 2016/5/15.
 */
public class PaymentDetails implements Serializable {

    private static final long serialVersionUID = 3471988528535440129L;

    private PaymentType paymentType;
    private String creditCardNumber;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
