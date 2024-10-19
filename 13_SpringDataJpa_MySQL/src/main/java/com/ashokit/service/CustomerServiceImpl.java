package com.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.CustomerDao;
import com.ashokit.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer creatingNewBrandCustomer(Customer customer) {
		
		//calling the ORM Method to save customer Information i.e.,inserting the record into DB Table
		Customer savedCustomer = customerDao.save(customer);
		
		return savedCustomer;
	}
	
	@Override
	public Iterable<Customer> creatingNewBrandCustomers(List<Customer> customers) {
	
		//Calling the ORM method to save all customer information
		return customerDao.saveAll(customers);
	}
	
	@Override
	public Optional<Customer> getCustomerById(Integer customerId) {
		Optional<Customer> customerInfo = customerDao.findById(customerId);
		return customerInfo;
	}
	
	@Override
	public Iterable<Customer> getCustomersByIds(List<Integer> customerIds) {
		return customerDao.findAllById(customerIds);
	}
	
	@Override
	public Iterable<Customer> getAllCustomers() {
		return customerDao.findAll();
	}
	
	@Override
	public String deleteCustomer(Customer customer) {
		customerDao.delete(customer);
		return "Customer Deleted Successfully";
	}
	
	@Override
	public String deleteCustomers(List<Integer> customerIds) {
		customerDao.deleteAllById(customerIds);
		return "Customers Deleted Successfully";
	}
}