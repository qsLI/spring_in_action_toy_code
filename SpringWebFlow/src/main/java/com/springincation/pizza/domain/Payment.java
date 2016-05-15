package com.springincation.pizza.domain;

import java.io.Serializable;

/**
 * Created by KL on 2016/5/15.
 */
public class Payment implements Serializable {

    private static final long serialVersionUID = -3175681440818013436L;

    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
