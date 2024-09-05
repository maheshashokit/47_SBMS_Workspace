package com.ashokit.spring.client;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.spring.beans.Student;



public class SpringClient {
	
	public static void main(String[] args) {
		
		//working with ApplicationContext i.e.,Pre-Instantiating the Spring Beans
		ApplicationContext dflb = new ClassPathXmlApplicationContext("spring.xml");	
		
		Student studentBean = dflb.getBean(Student.class);
		studentBean.displayStudentDetails();
		System.out.println(studentBean);
		
		java.util.Date currentDate = dflb.getBean(Date.class);
		System.out.println(currentDate);
		
	}

}
