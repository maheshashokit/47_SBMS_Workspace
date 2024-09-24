package com.ashokit.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ashokit.bean.Employee;

@Component
public class EmployeeUtils {
	
	//Returning the List<Employee>
	public List<Employee> getAllEmployeesInfo(){
		
		List<Employee> empList = new ArrayList<>();
		
		//try with Resource
		try(FileReader fr =  new FileReader("src/main/resources/ashokit_employees.txt");
			BufferedReader br  = new BufferedReader(fr);){
			
			String currentRecord;
			
			while((currentRecord = br.readLine()) != null) {
				
				//getting current line and Spliting based on comma seperated
				String recordValues[] = currentRecord.split(",");
				
				//extracting values from each record
				Integer empId = Integer.valueOf(recordValues[0]);
				String empName = recordValues[1];
				String emailId = recordValues[2];
				
				//Adding current employee information into employeeList
				empList.add(new Employee(empId,empName,emailId));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

}
