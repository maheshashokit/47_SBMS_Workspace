package com.ashokit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.enities.Customer;
import com.ashokit.services.CustomerService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Customer customer  = new Customer();
		customer.setCustomerName("Suresh3");
		customer.setCustomerLocation("Mumbai");
		
		//calling the saveCustomer
		//Customer savedCustomer = customerService.createNewBrandCustomerUsingSaveAndFlush(customer);
		///System.out.println(savedCustomer);
		
		//calling the delete customers
		customerService.terminateCustomers(List.of(1,2,52));
		
		//fetching all Customers
		Customer cust = new Customer();
		cust.setCustomerName("Suresh3");
		cust.setCustomerLocation("Mumbai");
		//Will fetch all the records from table
		customerService.fetchAllCustomers(cust);
		
		//getting the customerDetails
		//Customer customerInfo = customerService.fetchCustomerDetailsById(1022);
		//System.out.println(customerInfo);
	}
}
