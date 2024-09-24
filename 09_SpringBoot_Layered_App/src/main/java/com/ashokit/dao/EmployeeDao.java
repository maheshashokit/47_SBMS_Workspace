package com.ashokit.dao;

import java.util.List;

import com.ashokit.bean.Employee;

public interface EmployeeDao {
	
	//create one new employee
	public boolean createNewEmployee(Employee employee);
	
	//creating bulk of new employees
	public int createNewEmployees(List<Employee> employeesList);

}
