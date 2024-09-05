package com.ashokit;

public class Role {
	
	private String roleName;
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	@Override
	public String toString() {
		return roleName;
	}
}