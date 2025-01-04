package com.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/wishes")
public class WishResource {
	
	//Developing RestAPI's 
	@GetMapping(value = "/")
	public ResponseEntity<String> getWishes(){
		String message = "Welcome To AshokIT For Rest API Development"+ new java.util.Date();
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}	

}
