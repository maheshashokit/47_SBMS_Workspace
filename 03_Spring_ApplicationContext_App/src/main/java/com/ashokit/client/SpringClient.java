package com.ashokit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.beans.Course;
import com.ashokit.beans.Student;

public class SpringClient {
	
	public static void main(String[] args) {
		
		//working with BeanFactory i.e.,OnDemand Objects are creating 
		/*System.out.println("BeanFactory Container......");
		DefaultListableBeanFactory dflb = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader xmdr =  new XmlBeanDefinitionReader(dflb);
		xmdr.loadBeanDefinitions("spring.xml");*/
		
		//working with ApplicationContext i.e.,Pre-Instantiating the Spring Beans
		ApplicationContext dflb = new ClassPathXmlApplicationContext("spring.xml");	
		
		Student std = dflb.getBean(Student.class);
		System.out.println(std);
		
		
		
		
	}

}
