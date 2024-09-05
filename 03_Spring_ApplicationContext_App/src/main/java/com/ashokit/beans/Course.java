package com.ashokit.beans;

public class Course {
	
	private String id;
	
	private String name;
	
	private float fee;
	
	public Course() {
		System.out.println("Course Class Constructor.....");
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFee(float fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
