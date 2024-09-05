package com.ashokit;

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
		return String.format("DoorNo:%s,StreetName:%s,CityName:%s", doorNo,streetName,city);
	}
}