package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class WishDao {
	
	public WishDao() {
		System.out.println("WishDao Class Constructor....");
	}

	public String getDisplayWishes() {
		return "Welcome To AshokIT For SpringBoot Development";
	}
}
