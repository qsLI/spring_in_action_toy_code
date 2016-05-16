package com.springinaction.pizza.domain;

import org.apache.commons.lang3.text.WordUtils;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by KL on 2016/5/15.
 */
public enum Topping implements Serializable {
    PEPPERONI,
    SAUSAGE,
    HAMBURGER,
    MUSHROOM,
    CANDIAN_BACON,
    PINEAPPLE,
    GREEN_PEPPER,
    JALAPENO,
    TOMATO,
    ONION,
    EXTRA_CHEESE,;

    public static List<Topping> asList() {
        Topping[] all = Topping.values();
        return Arrays.asList(all);
    }


    @Override
    public String toString() {
        return WordUtils.capitalizeFully(name().replace('_', ' '));
    }
}
