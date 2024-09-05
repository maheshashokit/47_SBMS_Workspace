package com.ashokit.beans;

public class User {
	
	private String username;
	
	private String password;
	
	private Address address;
	
	public User(String username,String password,Address address) {
		this.username = username;
		this.password = password;
		this.address = address;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		System.out.println(address);
		return String.format("Username is %s and password is %s", username,password);
	}
}
