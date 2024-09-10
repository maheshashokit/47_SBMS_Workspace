package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ashokit.bean.Employee;
import com.ashokit.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	public void brandNewEmployee(Employee emp) {
		
		//calling the service method
		employeeService.insertNewEmployee(emp);
		
	}
	
	
	public void displayEmployees() {
		
		employeeService.retrieveAllEmployees();
	}

}
