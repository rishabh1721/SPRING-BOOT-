package com.javalearning.rishabh.module_1.of_learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    PaymentService paymentService() {
        return new PaymentService();
    }
}
