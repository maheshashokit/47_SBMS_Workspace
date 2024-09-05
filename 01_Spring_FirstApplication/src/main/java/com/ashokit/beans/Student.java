package com.ashokit.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	//Simple Dependencies
	private String id;
	
	private String name;
	
	private Integer discount;
	
	//Collection Dependencies	
	private Set<String> contactNos;
	
	private List<String> emailIds;
	
	private Map<String,String> qualifications;
	
	private String[] courseNames;
	
	private Properties dbProperties;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setContactNos(Set<String> contactNos) {
		this.contactNos = contactNos;
	}
	
	public void setEmailIds(List<String> emailIds) {
		this.emailIds = emailIds;
	}
	
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	
	public void setCourseNames(String[] courseNames) {
		this.courseNames = courseNames;
	}
	
	public void setQualifications(Map<String, String> qualifications) {
		this.qualifications = qualifications;
	}
	
	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}
	
	//service method display data
	public void displayData() {
		System.out.println("Student Id     			::::::" + id);
		System.out.println("Student Name    		::::::" + name);
		System.out.println("Student Discount  		::::::" + discount);
		System.out.println("Student Contact 		::::::" + contactNos);
		System.out.println("Student Email   		::::::" + emailIds);
		System.out.println("Student Qualification   ::::::" + qualifications);
		System.out.println("Course Names            ::::::" + Arrays.toString(courseNames));
		System.out.println("Database Properties     ::::::" + dbProperties);
	}
}
