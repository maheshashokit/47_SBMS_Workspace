package com.ashokit.beans;

public class Role {

	public Role() {
		System.out.println("Role Class Constructor......");
	}
	
	//business
	public String getRoleByUser(String userId) {
		return "HRADMIN";
	}
}
