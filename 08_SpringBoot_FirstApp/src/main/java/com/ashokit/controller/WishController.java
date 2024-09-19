package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ashokit.services.WishService;

@Controller
public class WishController {
	
	@Autowired
	private WishService wishService;
	
	public WishController() {
		System.out.println("WishController Class Constructor");
	}
	
	public void displayWishes() {
		String wishMessage = wishService.getWishes();
		System.out.println(wishMessage);
	}

}
