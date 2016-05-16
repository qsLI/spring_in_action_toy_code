package com.springinaction.pizza.domain;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.text.WordUtils.capitalizeFully;

/**
 * Created by KL on 2016/5/15.
 */
public enum PaymentType {
    CASH, CHECK, CREDIT_CARD;

    public static List<PaymentType> asList() {
        PaymentType[] all = PaymentType.values();
        return Arrays.asList(all);
    }


    @Override
    public String toString() {
        return capitalizeFully(name().replace('_', ' '));
    }
}
