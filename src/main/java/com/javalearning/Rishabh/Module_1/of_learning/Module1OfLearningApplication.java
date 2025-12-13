package com.javalearning.rishabh.module_1.of_learning;

import com.javalearning.rishabh.module_1.of_learning.impl.EmailNotificationService;
import com.javalearning.rishabh.module_1.of_learning.impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1OfLearningApplication implements CommandLineRunner {

//	@Autowired
//	PaymentService ps;
//	@Autowired
//	PaymentService ps2;

	@Autowired
	NotificationService notificationServiceObj;

	public static void main(String[] args) {
		SpringApplication.run(Module1OfLearningApplication.class, args);


	}
	@Override
	public void run(String... args) throws Exception {
//		System.out.println(ps.hashCode());
//		System.out.println(ps2.hashCode());
//		ps.pay();
//		ps2.pay();

//		NotificationService notificationServiceObj = new EmailNotificationService();
//
//		notificationServiceObj.send("Hello World");

//		notficationServiceObj = new SmsNotificationService();
		notificationServiceObj.send("hello");




	}
}
