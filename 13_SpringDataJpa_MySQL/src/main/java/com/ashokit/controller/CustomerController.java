package com.ashokit.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ashokit.entity.Customer;
import com.ashokit.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public void createNewCustomer(Customer customer) {
		Customer customerDetails = customerService.creatingNewBrandCustomer(customer);
		if(Objects.nonNull(customerDetails)) {
			System.out.println("Customer Created SuccessFully....."+ customerDetails.getCustomerId());
			System.out.println(customerDetails);
		}else {
			System.out.println("Customer Not Created......");
		}
	}
	
	public void createNewCustomers(List<Customer> customers) {
		Iterable<Customer> newCustomers = customerService.creatingNewBrandCustomers(customers);
		newCustomers.forEach(eachCustomer -> System.out.println(eachCustomer));
	}
	
	public void fetchCustomerDetailsById(Integer customerId) {
		Optional<Customer> customerDetails = customerService.getCustomerById(customerId);
		//checking customer object is present in optional object or not
		if(customerDetails.isPresent()) {
			Customer customerInfo = customerDetails.get();
			System.out.println(customerInfo);
		}else {
			System.out.println("Supplied CustomerDetails are not Present in Database...");
		}
	}
	
	
	public void fetchCustomersDetailsByIds(List<Integer> customerIds) {
		Iterable<Customer> allCustomers = customerService.getCustomersByIds(customerIds);
		allCustomers.forEach(eachCustomer -> System.out.println(eachCustomer));
	}
	
	public void fetchAllCustomers() {
		Iterable<Customer> allCustomers = customerService.getAllCustomers();
		allCustomers.forEach(eachCustomer -> System.out.println(eachCustomer));
	}
	
	public void removedCustomer(Customer customer) {
		String deleteStatus = customerService.deleteCustomer(customer);
		System.out.println(deleteStatus);
	}
	
	public void removeCustomers(List<Integer> customerIds) {
		String deleteStatus = customerService.deleteCustomers(customerIds);
		System.out.println(deleteStatus);
	}
	

}
