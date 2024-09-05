package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ashokit.services.UserService;

@Controller

public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	public UserController() {
		System.out.println("UserController - Class");
	}

}
