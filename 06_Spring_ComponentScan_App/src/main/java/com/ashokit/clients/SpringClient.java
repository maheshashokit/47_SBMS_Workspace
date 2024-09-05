package com.ashokit.clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.controller.PersonController;
import com.ashokit.controller.UserController;
import com.ashokit.services.UserService;

public class SpringClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		UserController userController = context.getBean(UserController.class);
		System.out.println(userController);
		
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);
		userService.display();
		
		PersonController personController = context.getBean(PersonController.class);
		System.out.println(personController);
	}

}
