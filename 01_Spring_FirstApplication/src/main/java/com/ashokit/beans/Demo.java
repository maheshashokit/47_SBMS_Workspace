package com.ashokit.beans;

public class Demo {
	
	//Simple dependency
	private String topicName;

	public Demo() {
		System.out.println("Demo Class Constructor......");
	}
	
	//setter method for topicName
	public void setTopicName(String topicName) {
		System.out.println("Spring Container Using Setter Method To inject value for topicName Property...");
		this.topicName = topicName;
	}
	
	@Override
	public String toString() {
		return topicName;
	}
}