package com.ashokit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.WishDao;

@Service
public class WishService {
	
	@Autowired
	private WishDao wishDao;
	
	public WishService() {
		System.out.println("WishService Class Constructor.....");
	}
	
	public String getWishes() {
		return wishDao.getDisplayWishes();
	}

}
