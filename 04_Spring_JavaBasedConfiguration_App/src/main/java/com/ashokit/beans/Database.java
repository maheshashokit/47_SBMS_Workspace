package com.ashokit.beans;

public class Database {
	
	private String jdbcUrl;
	
	private String driverClass;
	
	private String dbUsername;
	
	private String dbPassword;
	
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
	
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
	@Override
	public String toString() {
		return driverClass;
	}

}
