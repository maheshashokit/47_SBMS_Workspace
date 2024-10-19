package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.dao.EmployeeDao;
import com.ashokit.entity.Employee;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private EmployeeDao employeeDao;	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Employee  e = new Employee();
		e.setEmployeeName("Mahesh");
		e.setEmployeeSalary(25000);
		
		Employee savedEmployee = employeeDao.save(e);
		System.out.println("Employee Id::::" + savedEmployee.getEmployeeId());
	}
}