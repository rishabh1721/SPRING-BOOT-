package com.javalearning.rishabh.module_1.of_learning.impl;

import com.javalearning.rishabh.module_1.of_learning.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class SmsNotificationService implements NotificationService {

    @Override
    @ConditionalOnProperty(name = "notification.type" , havingValue = "sms")

    public void send(String message) {
        System.out.println("SMS Notification Service: " + message);
    }
}
