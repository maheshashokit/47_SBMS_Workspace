package com.ashokit.bean;

public class Employee {

	private Integer empId;
	
	private String empName;
	
	private String emailId;
	
	
	public Employee(Integer empId, String empName, String emailId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", emailId=" + emailId + "]";
	}	
}
