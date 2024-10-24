package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.CustomerDao;
import com.ashokit.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class CustomerService {
		
	@Autowired 
	private EntityManager entityManager;
	
	@Autowired
	private CustomerDao customerDao;
	
	public void getCustomerById(Integer customerId) {
		
		//creating the StoredProcedureQuery Object
		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("GET_CUSTOMER_BY_ID");
		
		//setting the in parameters and out parameters of stored procedure
		query.registerStoredProcedureParameter(1,Integer.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class,ParameterMode.OUT);
		
		//setting value into Input variable
		query.setParameter(1, customerId);
		
		String customerName = (String)query.getOutputParameterValue(2);
		System.out.println("CustomerName:::::" + customerName);
	}
	
	
   public void getAllCustomers() {
	   
	   StoredProcedureQuery query = entityManager.createStoredProcedureQuery("GET_ALL_CUSTOMERS",Customer.class);
	   	   
	   List<Customer> customerList = query.getResultList();
	   customerList.stream().forEach(cust -> System.out.println(cust));
   }
   
   public void getAllCustomersByNativeQuery() {
	   List<Customer> allCustomers = customerDao.fetchAllCustomers();
	   allCustomers.forEach(System.out::println);
   }
}
