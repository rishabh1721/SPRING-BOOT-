package com.javalearning.rishabh.module_1.of_learning;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay() {
        System.out.println("Payment successful!");
    }
    @PostConstruct
    public void pay2() {
        System.out.println("Payment start!");
    }
    @PreDestroy
    public void pay3() {
        System.out.println("Payment complete!");
    }
}

