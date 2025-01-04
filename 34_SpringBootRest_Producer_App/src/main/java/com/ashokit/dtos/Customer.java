package com.ashokit.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
	
	private String custId;
	
	private String custName;
	
	private String custLocation;
}