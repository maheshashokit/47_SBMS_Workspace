package com.ashokit.service;

import java.util.List;
import java.util.Optional;

import com.ashokit.entity.Customer;

public interface CustomerService {
	
	public Customer creatingNewBrandCustomer(Customer customer);
	
	public Iterable<Customer> creatingNewBrandCustomers(List<Customer> customers);
	
	public Optional<Customer> getCustomerById(Integer customerId);
	
	public Iterable<Customer> getCustomersByIds(List<Integer> customerIds);
	
	public Iterable<Customer> getAllCustomers();
	
	public String deleteCustomer(Customer customer);
	
	public String deleteCustomers(List<Integer> customerIds);
	
	

}