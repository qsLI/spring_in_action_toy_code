package com.springincation.pizza.service;


import com.springincation.pizza.domain.Order;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.LogManager.getLogger;

/**
 * Created by KL on 2016/5/15.
 */
public class OrderServiceImpl {
    public static final Logger LOGGER =  getLogger(OrderServiceImpl.class);

    public OrderServiceImpl() {
    }

    public void saveOrder(Order order) {
        LOGGER.debug("SAVING ORDER: ");
        LOGGER.debug(" Customer: " + order.getCustomer().getName());
        LOGGER.debug(" # of Pizzas: " + order.getPizzas().size());
        LOGGER.debug(" Payment: " + order.getPayment());
    }
}
