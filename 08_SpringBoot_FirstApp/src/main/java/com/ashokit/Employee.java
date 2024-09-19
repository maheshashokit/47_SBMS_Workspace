package com.ashokit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${employeeId}")
	private String empId;
	
	@Value("${employeeName}")
	private String empName;
	
	@Value("${designation}")
	private String jobDesignation;
	
	@Value("${salary}")
	private Integer empSalary;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", jobDesignation=" + jobDesignation
				+ ", empSalary=" + empSalary + "]";
	}

	

}
