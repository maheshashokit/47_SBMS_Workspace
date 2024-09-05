package com.ashokit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public UserService() {
		System.out.println("UserService - Class");
	}
	
	public void display() {
		System.out.println("UserDao::::" + userDao);
	}

}
