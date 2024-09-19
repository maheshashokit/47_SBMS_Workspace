package com.ashokit;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import com.ashokit.controller.WishController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		//Holding the Spring Container Object
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//Requesting the Spring Bean from Spring Container
		WishController controller = context.getBean(WishController.class);
		controller.displayWishes();
		System.out.println(controller);	
		Date currentDate = context.getBean(Date.class);
		System.out.println(currentDate);		
		
		Employee empBean = context.getBean(Employee.class);
		System.out.println(empBean);
	}
	
	@Bean
	public CommandLineRunner getCommandLineRunner() {
	   return args -> {
		   System.out.println("CommandLineRunner With lambda Expressions.......");
	   };	   
	}
	
	@Bean
	@Order(3)
	public CommandLineRunner getCommandLineRunner2() {
	   return args -> {
		   System.out.println("CommandLineRunner With lambda Expressions-2.......");
	   };	   
	}
	
	//Configure Java Class as Spring Beans by using @Bean Annotations
	@Bean
	public Date getCurrentDate() {
		return new Date();
	}
}