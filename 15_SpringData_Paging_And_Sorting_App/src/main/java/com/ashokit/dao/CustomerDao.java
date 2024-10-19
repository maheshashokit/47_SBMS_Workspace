package com.ashokit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ashokit.enities.Customer;

public interface CustomerDao extends PagingAndSortingRepository<Customer, Integer>,
									 JpaRepository<Customer, Integer>{

}