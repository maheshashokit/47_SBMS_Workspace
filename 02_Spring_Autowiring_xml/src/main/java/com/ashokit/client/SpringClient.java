package com.ashokit.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashokit.Test;
import com.ashokit.User;

public class SpringClient {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory dflb = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(dflb);
		xbdr.loadBeanDefinitions("spring.xml");
		
		User userBean = dflb.getBean(User.class);
		userBean.getUserDetails("AIT123");
		
		Test test = dflb.getBean(Test.class);
		System.out.println(test);
		
	}
}