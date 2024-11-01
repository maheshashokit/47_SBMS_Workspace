package com.ashokit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Login;

public interface LoginDao extends JpaRepository<Login, Integer>{

}
