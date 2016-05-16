package com.springinaction.pizza.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KL on 2016/5/15.
 */
public class Pizza implements Serializable {

    private static final long serialVersionUID = 2955334363112141742L;

    private PizzaSize size;
    private List<Topping> toppings;

    public Pizza() {
        toppings = new ArrayList<>();
        size = PizzaSize.LARGE;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setSize(String sizeString) {
        this.size = PizzaSize.valueOf(sizeString);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public void setToppings(String[] toppingStrings) {
        for (int i = 0; i < toppingStrings.length; i++) {
            toppings.add(Topping.valueOf(toppingStrings[i]));
        }
    }
}
