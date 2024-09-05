package com.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.beans.Email;

@Configuration
public class EmailConfig {
	
	public EmailConfig() {
		System.out.println("EmailConfig Class Constructor.....");
	}
	
	//another Spring bean definitions
	@Bean
	public Email getEmailConfig() {
		return new Email();
	}

}
