package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.bean.Employee;
import com.ashokit.dao.EmployeeDao;
import com.ashokit.util.EmployeeUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private EmployeeUtils employeeUtils;

	@Override
	public void createBrandNewEmployee() {
		
		//Get the single record from employeeUtility method
		Employee employee = employeeUtils.getAllEmployeesInfo().get(0);
		
		//passing this employee object to DAO method
		boolean recordStatus = employeeDao.createNewEmployee(employee);
		
		if(recordStatus) {
			System.out.println("Employee Record is Created.....");
		}else {
			System.out.println("Employee Record is not Created......");
		}

	}

	@Override
	public void createBrandNewEmployees() {
		
		//Getting all employee records from employeeUtility method
		List<Employee> allEmployees = employeeUtils.getAllEmployeesInfo();
		
		//calling Dao method
		int createdCount = employeeDao.createNewEmployees(allEmployees);
		
		//checking logic 
		if(allEmployees.size() == createdCount) {
			System.out.println("All Records are Processed Successfully in Service.......");
		}

	}

}
