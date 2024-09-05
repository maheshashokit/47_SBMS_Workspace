package com.ashokit.beans;

public class User {

	// Requires Role Object
	private Role role;
	
	private Course course;

	public User() {
		System.out.println("User Class Constructor.......");
	}

	public User(Role role, Course course){
		System.out.println("User Class Constructor......");
		this.role= role;
		this.course = course;
	}
	
	
	public void setRole(Role role) {
		System.out.println("Inside Role From User");
		this.role = role;
	}
	
	public void setCourse(Course course) {
		System.out.println("Inside Role From Course");
		this.course = course;
	}

	//Business method
	public void getUserByRole(String userId) {
		String roleName = role.getRoleByUser(userId);
		System.out.println("Role Checking::::::" + "HRADMIN".equals(roleName));
	}
}
