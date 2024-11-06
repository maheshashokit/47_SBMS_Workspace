package com.ashokit.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "maheshit_customers")
public class Customers {

	@Id
	@Column(name = "customer_id")
	@GeneratedValue
	private Integer customerId;

	@Column(name = "first_name")
	private String firsName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "customer_location")
	private String customerLcoation;

	@Transient
	private String fullName;

	public String getFullName() {
		fullName = firsName + " " + lastName;
		return fullName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCustomerLcoation() {
		return customerLcoation;
	}

	public void setCustomerLcoation(String customerLcoation) {
		this.customerLcoation = customerLcoation;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", firsName=" + firsName + ", lastName=" + lastName
				+ ", customerLcoation=" + customerLcoation + ", fullName=" + fullName + "]";
	}
	
	
	
	
	
	

}