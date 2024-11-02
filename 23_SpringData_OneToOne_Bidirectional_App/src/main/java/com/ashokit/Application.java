package com.ashokit;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.dao.LoginDao;
import com.ashokit.dao.StudentDao;
import com.ashokit.entity.Login;
import com.ashokit.entity.Student;
import com.ashokit.service.LoginService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private LoginDao loginDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}	
	
	@Override
	public void run(String... args) throws Exception {
		
		//prepared the two students information
		/*Student st = new Student();
		st.setStudentName("karthik");
		st.setStudentLocation("Hyderabad");
		st.setStudentContactNo("123456789");
		st.setStudentEmail("karthik.ashokit@gmail.com");
		st.setCreatedDate(new Date());
		
		Student st1 = new Student();
		st1.setStudentName("rajesh");
		st1.setStudentLocation("Delhi");
		st1.setStudentContactNo("123456789");
		st1.setStudentEmail("rajesh.ashokit@gmail.com");
		st1.setCreatedDate(new Date());
		
		//preparing the two logins for two students
		Login login = new Login();
		login.setUsername("karthik.ashokit@gmail.com");
		login.setPassword("welcome@123");
		login.setStatus("Active");
		login.setCreatedDate(new Date());
		login.setStudent(st);
		
		Login login1 = new Login();
		login1.setUsername("rajesh.ashokit@gmail.com");
		login1.setPassword("welcome@123");
		login1.setStatus("Active");
		login1.setCreatedDate(new Date());
		login1.setStudent(st1);
		
		//calling the service
		loginService.saveAll(List.of(login,login1));*/
		
		//parent to child access the records
		//Student student = studentDao.findById(1).get();
		//System.out.println("Student Information ::::" + student);
		//System.out.println("Student Information with Login Details::::" + student.getLogin());
		
		//studentDao.deleteById(1);
		
		loginDao.deleteById(2);
	}
}
