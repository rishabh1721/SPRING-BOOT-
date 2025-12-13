package com.javalearning.rishabh.module_1.of_learning.impl;

import com.javalearning.rishabh.module_1.of_learning.NotificationService;

public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("SMS Notification Service: " + message);
    }
}
