package com.ashokit.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashokit.bean.Employee;
import com.ashokit.config.ApplicationConfig;
import com.ashokit.controller.EmployeeController;

public class SpringClient {
	
	public static void main(String[] args) {
		
		//creating the object for Spring Container
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		//Creating the Employee object for inserting data into Database
		Employee emp = new Employee("568","Ashok","ashokitschools@gmail.com",LocalDate.now(),"Ashok");
		
		EmployeeController empController = context.getBean(EmployeeController.class);
		
		//calling Controller method
		//empController.brandNewEmployee(emp);
		
		empController.displayEmployees();
		
	}

}
