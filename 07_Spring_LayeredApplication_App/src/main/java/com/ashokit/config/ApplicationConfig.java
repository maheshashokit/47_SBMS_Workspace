package com.ashokit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value = "database.properties")
@ComponentScan(basePackages = {"com.ashokit"})
public class ApplicationConfig {
	
	@Value("${driverClassName}")
	private String driverClassName;
	
	@Value("${driverUrl}")
	private String driverUrl;
	
	@Value("${dbUserName}")
	private String userName;

	@Value("${dbPassword}")
	private String password;

	
	//Preparing the DriverManagerDataSource Object
	@Bean
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(driverClassName);
		dmds.setUrl(driverUrl);
		dmds.setUsername(userName);
	    dmds.setPassword(password);
	    
	    return dmds;	
		
	}
	
	//Preparing the JdbcTemplate Object
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getDataSource());
		
		return jt;	
	}	

}
