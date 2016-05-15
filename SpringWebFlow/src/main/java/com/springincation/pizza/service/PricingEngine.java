package com.springincation.pizza.service;

import com.springincation.pizza.domain.Order;

/**
 * Created by KL on 2016/5/15.
 */
public interface PricingEngine {
    public float calculateOrderTotal(Order order);
}
