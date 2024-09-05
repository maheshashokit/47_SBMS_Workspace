package com.ashokit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.ashokit.beans.Address;
import com.ashokit.beans.Student;
import com.ashokit.beans.User;

//Representing the Java Class as Spring Configuration Class which is equivalent to XML File
@Configuration

//Inheriting the bean definitions from another configuration classes
@Import(value = {DatabaseConfig.class,EmailConfig.class})

//Inheriting the bean definitions from XML File i.e.,Old Style of Spring Application development
@ImportResource("spring.xml")

//Informing about properties file about Spring Container
@PropertySource(value = "database.properties")
public class AppConfig {
	
	@Value("${databaseUsername}")
	private String dbUserName;
	
	@Value("${databasePassword}")
	private String dbPassword;
	
	//Default Constructor.....
	public AppConfig() {
		System.out.println("AppConfig Class Constructor.......");
	}
	
	//Representing the Java method as Spring Bean which is equivalent to bean definition
	@Bean(name = "userBean")
	public User getUserObject() {
		
		Address address = getAddressBean();
		
		//creating the User object and Injecting properties using constructor
		User user  = new User("Mahesh","Mahesh@123",address);
		System.out.println("DatabaseUsername:::" + dbUserName);
		System.out.println("DatabasePassword:::" + dbPassword);
		
		//returning the user object
		return user;
	}
	
	
	@Bean
	public Student getStudentObject() {
		
		//creating the Student object
		Student student = new Student();
		
		//setting the values
		student.setId("AIT123");
		student.setName("Ashok");
		student.setLocation("Hyderabad");
		
		//Injecting the Address object into Student Object
		student.setAddress(getAddressBean());
		
		
		return student;
		
	}
	
	
	@Bean
	public Address getAddressBean() {
		
		//Creating the Address Bean
		Address address = new Address();
		
		//setting the values
		address.setDoorNo("1-2-3");
		address.setStreetName("XYZ");
		address.setCity("Hyderabad");
		
		return address;
		
	}

}
