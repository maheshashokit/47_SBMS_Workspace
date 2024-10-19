package com.ashokit.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Serializable> {

}
