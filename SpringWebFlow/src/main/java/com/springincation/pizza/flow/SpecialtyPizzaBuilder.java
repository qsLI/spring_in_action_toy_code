package com.springincation.pizza.flow;

import com.springincation.pizza.domain.Pizza;
import com.springincation.pizza.domain.Topping;
import org.apache.log4j.Logger;
import org.springframework.webflow.execution.Action;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KL on 2016/5/15.
 */
public class SpecialtyPizzaBuilder implements Action {
    private static final Logger LOGGER = Logger.getLogger(SpecialtyPizzaBuilder.class);

    public Event execute(RequestContext requestContext) throws Exception {
        String type = requestContext.getRequestParameters().get("pizzaType");

        LOGGER.debug("BUIDING A SPECIALTY PIZZA: " + type);

        Pizza pizza = (Pizza) requestContext.getFlowScope().get("pizza");
        if ("MEAT".equals(type)) {
            LOGGER.debug("BUILDING A CARNIVORE");

            List<Topping> meats = new ArrayList<Topping>();

            meats.add(Topping.CANDIAN_BACON);
            meats.add(Topping.HAMBURGER);
            meats.add(Topping.PEPPERONI);
            meats.add(Topping.SAUSAGE);

            pizza.setToppings(meats);
        } else if ("VEGGIE".equals(type)) {
            LOGGER.debug("BUILDING A HERBIVORE");
            List<Topping> meats = new ArrayList<Topping>();

            meats.add(Topping.GREEN_PEPPER);
            meats.add(Topping.MUSHROOM);
            meats.add(Topping.PINEAPPLE);
            meats.add(Topping.TOMATO);

            pizza.setToppings(meats);
        } else if ("THEWORKS".equals(type)) {
            LOGGER.debug("BUILDING AN OMNIVORE");

            List<Topping> meats = new ArrayList<Topping>();
            System.out.println("THE WORKS!");

            meats.add(Topping.CANDIAN_BACON);
            meats.add(Topping.HAMBURGER);
            meats.add(Topping.PEPPERONI);
            meats.add(Topping.SAUSAGE);
            meats.add(Topping.GREEN_PEPPER);
            meats.add(Topping.MUSHROOM);
            meats.add(Topping.PINEAPPLE);
            meats.add(Topping.TOMATO);
            meats.add(Topping.EXTRA_CHEESE);
            meats.add(Topping.ONION);
            meats.add(Topping.JALAPENO);

            pizza.setToppings(meats);
        }

        requestContext.getFlowScope().put("pizza", pizza);

        return new Event(this, "success");
        }
}
