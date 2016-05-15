package com.springincation.pizza.service;

import com.springincation.pizza.domain.Order;
import com.springincation.pizza.domain.Pizza;
import com.springincation.pizza.domain.PizzaSize;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import static org.apache.logging.log4j.LogManager.getLogger;

/**
 * Created by KL on 2016/5/15.
 */
public class PricingEngineImpl implements PricingEngine, Serializable{

    private static final long serialVersionUID = -1176669501490145783L;

    private static final Logger LOGGER =
            getLogger(PricingEngineImpl.class);
    private static Map<PizzaSize, Float> SIZE_PRICES;
    static {
        SIZE_PRICES = new HashMap<PizzaSize, Float>();
        SIZE_PRICES.put(PizzaSize.SMALL, 6.99f);
        SIZE_PRICES.put(PizzaSize.MEDIUM, 7.99f);
        SIZE_PRICES.put(PizzaSize.LARGE, 8.99f);
        SIZE_PRICES.put(PizzaSize.GINORMOUS, 9.99f);
    }

    public static float PRICE_PER_TOPPING = 0.20f;

    public PricingEngineImpl() {
    }

    public float calculateOrderTotal(Order order) {
        LOGGER.debug("Caculating order total");

        float total = 0.0f;

        for (Pizza pizza : order.getPizzas()) {
            float pizzaPrice = SIZE_PRICES.get(pizza.getSize());
            if (pizza.getToppings().size() > 2) {
                pizzaPrice += (pizza.getToppings().size() * PRICE_PER_TOPPING);
            }
            total += pizzaPrice;
        }
        return total;
    }
}
