package com.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.util.Streamable;

import com.ashokit.dao.CustomerDao;
import com.ashokit.entity.Customer;
import com.ashokit.service.CustomerService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired 
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("1. DAO Interface Method Call......");
	  	String customerName = customerDao.fetchCustomerName(1002);
		System.out.println("Customer Name ::::" + customerName);
		
		System.out.println("2.DAO Interface Method Call for Getting All Customers");
		List<Customer> allCustomers = customerDao.fetchAllCustomers();
		allCustomers.forEach(System.out::println);
		
		System.out.println("3.DAO Interface Method Call For Getting Count of Customers");
		Integer customerCount = customerDao.getCountOfCustomers();
		System.out.println("Customers Count :::::" + customerCount);
		
	    System.out.println("4.Service Method call.........");
		customerService.getCustomerById(1002);
		
		System.out.println("5.Service Method call.........");
		customerService.getAllCustomers();
		
		/*System.out.println("5.Streamable Method call.......");
		Streamable<Customer> allcusts = customerDao.findByCustomerLocation("Hyderabad");
		allcusts.forEach(System.out::println);*/	
	}
}
