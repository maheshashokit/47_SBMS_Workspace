package com.ashokit.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ashokit_employees")
public class Employee {
	
	@Id
	@Column(name="employee_id")
	@GenericGenerator(name="ashokit_emp_seq", strategy = "com.ashokit.generator.EmployeeGenerator")
	@GeneratedValue(generator = "ashokit_emp_seq")
	private String employeeId;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="employee_salary")
	private Integer employeeSalary;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
}
