package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.dao.CustomerDao;
import com.ashokit.services.CustomerService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	public CustomerService customerService;
	
	@Autowired
	public CustomerDao customerDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       
		System.out.println("1.....Selecting Data using Native Query....");
		customerService.fetchCustomerDetailsUsingNativeQuery();
		
		System.out.println();
		System.out.println("2.....Selecting Data Using HQL.......");
		customerService.fetchCustomerDetailsUsingHqlQuery();
		
		System.out.println();
		System.out.println("3.....Selecting Columns Data Using Native Query.......");
		customerService.fetchSelectedColumnsUsingNativeQuery();
		
		System.out.println();
		System.out.println("4.....Selecting Columns Data Using HQL Query.......");
		customerService.fetchSelectedColumnsUsingHqlQuery();
		
		System.out.println();
		System.out.println("5.....Selecting Data Using HQL Query Based on Location with NamedParameters.......");
		customerService.fetchCustomerDetailsByCity("Hyderabad1");
		
		System.out.println();
		System.out.println("6.....Selecting Data Using HQL Query Based on Location with Index.......");
		customerService.fetchCustomerDetailsByCity("Hyderabad2");
		
		System.out.println();
		System.out.println("7.....Updating the Customer Details based on CustomerId using @Query.......");
		customerDao.updateCustomerLocation("Hyderabad", 1002);
		
		System.out.println();
		System.out.println("8.....Deleting the Customer Details based on CustomerId using @Query.......");
		int deleteCount = customerDao.deleteCustomersByLocation("Hyderabad3");
		System.out.println("Deleted Customers:::::" + deleteCount);
	}
}
