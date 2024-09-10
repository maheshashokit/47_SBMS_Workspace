package com.ashokit.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ashokit.bean.Employee;

@Repository
public class EmployeeDao {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public EmployeeDao() {
       System.out.println("EmployeeDao Class.......");
    }
    
    //The below method will perform inserting the record into database
    public boolean createNewEmployee(Employee employee) {
    	
    	String INSERT_QUERY= "insert into ashokit_emps values(?,?,?,?,?)";
    	
    	//insertion,deletion,updation will be using update() from JdbcTemplate
    	int rowCount = jdbcTemplate.update(INSERT_QUERY,  employee.getEmployeeId(),employee.getEmpName(),
				    			                          employee.getEmailId(),LocalDate.now(),
				    			                          employee.getCreatedBy());
    	
    	
    	return rowCount > 0;
    	
    }
    
    public List<Map<String,Object>> getAllEmployees(){
    	
    	return jdbcTemplate.queryForList("select * from ashokit_emps");
    }

}
