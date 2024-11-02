package com.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.LoginDao;
import com.ashokit.entity.Login;

@Service
public class LoginService {
	

	@Autowired
	private LoginDao loginDao;
	
	
	public void saveAll(List<Login> logins) {
		List<Login> saveAll = loginDao.saveAll(logins);
		saveAll.forEach(login -> System.out.println(login));
	}
	
	public void getLoginById(Integer loginId) {
		
		Optional<Login> login = loginDao.findById(loginId);
		if(login.isPresent()) {
			Login loginDetails = login.get();
			System.out.println("Login Details:::::" + loginDetails);
		}
		
	}
}