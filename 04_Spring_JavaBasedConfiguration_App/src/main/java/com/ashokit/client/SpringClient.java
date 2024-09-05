package com.ashokit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashokit.beans.Database;
import com.ashokit.beans.Email;
import com.ashokit.beans.Student;
import com.ashokit.beans.Test;
import com.ashokit.beans.User;
import com.ashokit.config.AppConfig;

public class SpringClient {
	
	public static void main(String[] args) {
		
	    //Instantiating the Spring Container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Requesting User Spring Bean from Spring Container
		User userBean = context.getBean(User.class);
		System.out.println(userBean);
		
		System.out.println();
		
		//Requesting Student Spring Bean from Spring Container
		Student student = context.getBean(Student.class);
		System.out.println(student);
		
		System.out.println();
		Database database = context.getBean(Database.class);
		System.out.println(database);
		
		System.out.println();
		Email email = context.getBean(Email.class);
		System.out.println(email);
		
		Test test = context.getBean(Test.class);
		System.out.println(test);
	}

}
