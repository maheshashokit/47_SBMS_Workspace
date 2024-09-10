package com.ashokit.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.bean.Employee;
import com.ashokit.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public void insertNewEmployee(Employee emp) {
		//calling the Dao method 
		boolean createdStatus = employeeDao.createNewEmployee(emp);
		if(createdStatus) {
			System.out.println("Employee Record Created SuccessFully....."); 
		}else {
			System.out.println("Problem Occured While Creating Employee Record......");
		}
	}
	
	public void retrieveAllEmployees() {
		List<Map<String, Object>> allEmployees = employeeDao.getAllEmployees();
		
		//using java8 streams will iterate the List<Map> objects
		allEmployees.forEach(eachEmpMapObject -> {
			
			eachEmpMapObject.entrySet().stream().forEach(eachEntry ->{
			
				System.out.println(eachEntry.getKey() + "---" + eachEntry.getValue());
			});			
			System.out.println("");
		});
	}
	
}
