package com.ashokit.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashokit.beans.User;

public class DependencyObjectClient {

	public static void main(String[] args) {

		// Activating the Spring Container
		// DefaultListableBeanFactory is implementation class for BeanFactory(I)
		DefaultListableBeanFactory dfb = new DefaultListableBeanFactory();

		// Loading the Spring configuration file
		XmlBeanDefinitionReader xmdr = new XmlBeanDefinitionReader(dfb);
		xmdr.loadBeanDefinitions("spring.xml");

		System.out.println("Spring Container Got Activated and Completed Reading Spring Configuration File");
		
		User user = dfb.getBean(User.class);
		user.getUserByRole("AIT123");
		

	}

}
