package com.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.beans.Database;

@Configuration
public class DatabaseConfig {
	
	public DatabaseConfig() {
		System.out.println("DatabaseConfig Class Constructor.....");
	}
	
	//another Spring bean definitions
	@Bean
	public Database getDataSource() {
		return new Database();
	}

}
