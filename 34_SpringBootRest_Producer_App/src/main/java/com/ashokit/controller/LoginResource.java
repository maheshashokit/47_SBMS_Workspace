package com.ashokit.controller;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/login")
public class LoginResource {
	
	
	@GetMapping(value = "/")
	public ResponseEntity<String> validateLoginDetails(@RequestParam("userName") String userName,
			                                           @RequestParam("password") String password){
		
		if(Objects.nonNull(userName) && Objects.nonNull(password)) {
			if("Mahesh".equalsIgnoreCase(userName) && "Mahesh".equalsIgnoreCase(password)){
				return new ResponseEntity<String>("Login Success...", HttpStatus.OK);
			}else {
				return new ResponseEntity<String>("Login Failure...", HttpStatus.OK);
			}			
		}else {
			return new ResponseEntity<String>("Username & Password Can't be Empty....." ,HttpStatus.OK);
		}
		
	}

}
