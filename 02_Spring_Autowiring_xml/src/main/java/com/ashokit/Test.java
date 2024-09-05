package com.ashokit;

public class Test {
	
	private String message;
	
	private String wishMessage;
	
	public Test(String message,String wishMessage) {
		this.message = message;
		this.wishMessage = wishMessage;
	}
	
	public String toString() {
		return message + wishMessage;
	}

}
