package com.ashokit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ashokit.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer>{
	
	@Query(value = "call GET_ALL_CUSTOMERS()",nativeQuery = true)
	public List<Customer> fetchAllCustomers();
	
	@Query(value="call GET_CUSTOMER_COUNT()",nativeQuery = true)
	public Integer getCountOfCustomers();
	
	@Procedure(value ="GET_CUSTOMER_BY_ID",outputParameterName = "custName")
	//@Procedure(procedureName  ="GET_CUSTOMER_BY_ID")
	public String fetchCustomerName(@Param("custId")Integer customerId);
	
}