package com.ashokit.bean;

import java.time.LocalDate;

public class Employee {
	
	private String employeeId;
	
	private String empName;
	
	private String emailId;
	
	private LocalDate createdDate;
	
	private String createdBy;
	
	public Employee(String employeeId, String empName, String emailId, LocalDate createdDate, String createdBy) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.emailId = emailId;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + ", emailId=" + emailId + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + "]";
	}
}
