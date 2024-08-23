package com.ashokit.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.ashokit.beans.*;

public class SpringClient {
	
	public static void main(String[] args) {
		
		//Activating the Spring Container
		//DefaultListableBeanFactory is implementation class for BeanFactory(I)
		DefaultListableBeanFactory dfb = new DefaultListableBeanFactory();
		
		//Loading the Spring configuration file
		XmlBeanDefinitionReader xmdr = new XmlBeanDefinitionReader(dfb);
		xmdr.loadBeanDefinitions("spring.xml");
		
		System.out.println("Spring Container Got Activated and Completed Reading Spring Configuration File");
		
		//Requesting the spring bean from container by passing bean-id
		Demo demoBean  = (Demo)dfb.getBean("demo");
		Demo demoBean1 = (Demo)dfb.getBean("demo");
		Demo demoBean2 = (Demo)dfb.getBean("demo");
		
		System.out.println(demoBean.hashCode());
		System.out.println(demoBean1.hashCode());
		System.out.println(demoBean2.hashCode());
		
		System.out.println("**********************************************");

		Welcome wel  = (Welcome)dfb.getBean("welcome");
		Welcome wel1 = (Welcome)dfb.getBean("welcome");
		Welcome wel2 = (Welcome)dfb.getBean("welcome");
		System.out.println(wel.hashCode());
		System.out.println(wel1.hashCode());
		System.out.println(wel2.hashCode());
		
		System.out.println("**********************************************");

		Test test  = (Test)dfb.getBean("test");
		Test test1 = (Test)dfb.getBean("test");
		Test test2 = (Test)dfb.getBean("test");
		System.out.println(test.hashCode());
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());	
		
		System.out.println("**********************************************");
		Display disp =(Display)dfb.getBean("display");
		System.out.println(disp.hashCode());
		
	}
}