package com.ashokit;

public class User {
	
	private Address address;
	
	private Role role;
	
	//private String name;
	
	//Defining the constructor for constructor Autowire Strategy
	public User(Address address, Role role) {
		System.out.println("User Class Constructor.....");
		this.address = address;
		this.role = role;
		//this.name = name;
	}	
	
	//Defining the setter methods for byName,byType Autowire Strategy
	public void setAddress(Address address) {
		System.out.println("Setter Method for Address");
		this.address = address;
	}
	
	public void setRole(Role role) {
		System.out.println("Setter Method for Role");
		this.role = role;
	}
	
	//Business method
	public void getUserDetails(String userId) {
		System.out.println("UserID              ::::" + userId);
		System.out.println("User Address Details::::" + address);
		System.out.println("User Role Details   ::::" + role);
		//System.out.println("Name :::::" + name);
	}
	
}
