package com.ashokit.spring.beans;

public class Address {
	
	private String cityName;
	
	private String pinCode;
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", pinCode=" + pinCode + "]";
	}
}
