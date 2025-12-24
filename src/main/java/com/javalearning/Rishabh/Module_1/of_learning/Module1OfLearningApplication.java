package com.javalearning.rishabh.module_1.of_learning;

import com.javalearning.rishabh.module_1.of_learning.impl.EmailNotificationService;
import com.javalearning.rishabh.module_1.of_learning.impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1OfLearningApplication implements CommandLineRunner {

//	@Autowired
//	PaymentService ps;
//	@Autowired
//	PaymentService ps2;

//	@Autowired
//	final NotificationService notificationServiceObj;
//
//	public Module1OfLearningApplication(NotificationService notificationServiceObj) {
//		this.notificationServiceObj = notificationServiceObj; // constructor dependency injection
//	}

	@Autowired
	Map<String,NotificationService> NotificationServiceMap = new HashMap<>();

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

////		notficationServiceObj = new SmsNotificationService();
//		notificationServiceObj.send("hello");

		for(var notificationService : NotificationServiceMap.entrySet()){
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("hello");
		}




	}
}
