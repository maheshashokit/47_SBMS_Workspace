package com.ashokit.beans;

public class Enquiry {
	
	private String firstName;
	
	private String emailId;
	
	private String contactNo;
	
	private String course;
	
	public Enquiry() {
		
	}

	public Enquiry(String firstName, String emailId, String contactNo, String course) {
		this.firstName = firstName;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.course = course;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
