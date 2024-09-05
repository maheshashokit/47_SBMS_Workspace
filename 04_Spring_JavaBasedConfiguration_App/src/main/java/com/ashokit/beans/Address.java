package com.ashokit.beans;

public class Address {
	
	private String doorNo;
	
	private String streetName;
	
	private String city;
	
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return String.format("DoorNo is %s and StreetName is %s and City is %s", doorNo,streetName,city);
	}

}

