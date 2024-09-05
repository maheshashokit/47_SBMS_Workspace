package com.ashokit.beans;

public class Student {
	
	private String id;
	private String name;
	private String location;
	
	private Address address;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		System.out.println(address);
		return String.format("StudentId is %s and StudentName is %s and StudentLocation is %s", id,name,location);
	}

}
