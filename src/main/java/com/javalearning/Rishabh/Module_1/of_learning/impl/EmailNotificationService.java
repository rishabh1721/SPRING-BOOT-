package com.javalearning.rishabh.module_1.of_learning.impl;

import com.javalearning.rishabh.module_1.of_learning.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "notification.type" , havingValue = "email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email Notification Service: " + message);
    }
}
