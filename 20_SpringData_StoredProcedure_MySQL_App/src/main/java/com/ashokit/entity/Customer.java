package com.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ashokit_customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private Integer customerId;

	@Column(name = "customer_name", nullable=false)
	private String customerName;

	@Column(name="customer_location",nullable = false)
	private String customerLocation;

	@Column(name = "bill_amount", nullable = false)
	private Integer billAmount;
	
	public Customer() {
		
	}
	
	public Customer(Integer customerId, String customerName, String customerLocation, Integer billAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
		this.billAmount = billAmount;
	}
	
	public Customer(String customerName, String customerLocation, Integer billAmount) {
		this.customerName = customerName;
		this.customerLocation = customerLocation;
		this.billAmount = billAmount;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}

	public Integer getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Integer billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", cusotmerLocation="
				+ customerLocation + ", billAmount=" + billAmount + "]";
	}

}
