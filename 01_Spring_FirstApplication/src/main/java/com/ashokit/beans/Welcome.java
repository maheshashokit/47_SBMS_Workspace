package com.ashokit.beans;

public class Welcome {
	
	//Simple Dependency
	private String wishMessage;
	
	private String courseName;
	
	public Welcome() {
		System.out.println("Welcome Class Constructor......");
	}
	
	//Defining the parameterized constructor
	public Welcome(String wishMessage) {
		System.out.println("Spring Container Using Construcor To inject value for wishMessage Property...");
		this.wishMessage = wishMessage;
	}
	
	//Defining the parameterized constructor
	public Welcome(String wishMessage,String courseName) {
		System.out.println("Spring Container Using Two Parameter Construcor To inject value for wishMessage Property...");
		this.wishMessage = wishMessage;
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return wishMessage +" " + courseName;
	}
	
}