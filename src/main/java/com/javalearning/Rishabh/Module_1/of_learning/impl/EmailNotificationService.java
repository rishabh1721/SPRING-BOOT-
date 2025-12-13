package com.javalearning.rishabh.module_1.of_learning.impl;

import com.javalearning.rishabh.module_1.of_learning.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email Notification Service: " + message);
    }
}
