package com.ashokit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ashokit.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean createNewEmployee(Employee emp) {
		int rowCount = jdbcTemplate.update("insert into ashokit_employees values(?,?,?,?,?)", 
											emp.getEmpId(),emp.getEmpName(),emp.getEmailId(),
											new java.sql.Date(new java.util.Date().getTime()),
											emp.getEmpName());
		return rowCount > 0;
	}

	@Override
	public int createNewEmployees(List<Employee> employeesList) {
		int rowCount = 0;
		for(Employee emp : employeesList) {
			rowCount += jdbcTemplate.update("insert into ashokit_employees values(?,?,?,?,?)", 
											emp.getEmpId(),emp.getEmpName(),emp.getEmailId(),
											new java.sql.Date(new java.util.Date().getTime()),
											emp.getEmpName());
		}
		
		//Ensuring txt file data and inserted rowcount matching or not
		if(employeesList.size()  == rowCount) {
			System.out.println("All Records are Processed Successfully in DAO.......");
		}
		
		return rowCount;
	}

}
