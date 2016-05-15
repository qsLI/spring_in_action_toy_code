package com.springincation.pizza.flow;

import com.springincation.pizza.domain.*;
import com.springincation.pizza.service.CustomerNotFoundException;
import com.springincation.pizza.service.CustomerService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.springincation.pizza.domain.PaymentType.CREDIT_CARD;
import static org.apache.logging.log4j.LogManager.getLogger;

/**
 * Created by KL on 2016/5/15.
 */
@Component
public class PizzaFlowActions {
    public static final Logger LOGGER = getLogger(PizzaFlowActions.class);

    @Autowired
    CustomerService customerService;

    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        Customer customer = customerService.lookupCustomer(phoneNumber);
        if (customer != null) {
            return customer;
        } else {
            throw new CustomerNotFoundException();
        }
    }

    public void addCustomer(Customer customer) {
        LOGGER.warn("TODO: Flesh out the addCustomer() method.");
    }

    public Payment verifyPayment(PaymentDetails paymentDetails) {
        Payment payment = null;
        if (paymentDetails.getPaymentType() == CREDIT_CARD) {
            payment = new CreditCardPayment();
        } else {
            payment = new CashOrCheckPayment();
        }
        return payment;
    }

    public void saveOrder(Order order) {
        LOGGER.warn("TODO: Flesh out the saveOrder() method.");
    }

    public boolean checkDeliverArea(String zipCode) {
        LOGGER.warn("TODO: Flesh out the checkDeliverArea() method.");
        return "75075".equalsIgnoreCase(zipCode);
    }
}
