package com.ashokit;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.dao.LoginDao;
import com.ashokit.entity.Login;
import com.ashokit.entity.Student;
import com.ashokit.service.LoginService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private LoginDao loginDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*//prepared the two students information
		Student st = new Student();
		st.setStudentName("Mahesh");
		st.setStudentLocation("Hyderabad");
		st.setStudentContactNo("123456789");
		st.setStudentEmail("mahesh.ashokit@gmail.com");
		st.setCreatedDate(new Date());
		
		Student st1 = new Student();
		st1.setStudentName("Ashok");
		st1.setStudentLocation("Delhi");
		st1.setStudentContactNo("123456789");
		st1.setStudentEmail("ashok.ashokit@gmail.com");
		st1.setCreatedDate(new Date());
		
		//preparing the two logins for two students
		Login login = new Login();
		login.setUsername("mahesh.ashokit@gmail.com");
		login.setPassword("welcome@123");
		login.setStatus("Active");
		login.setCreatedDate(new Date());
		//setting student object into login object
		login.setStudent(st);
		
		Login login1 = new Login();
		login1.setUsername("ashok.ashokit@gmail.com");
		login1.setPassword("welcome@123");
		login1.setStatus("Active");
		login1.setCreatedDate(new Date());
		//setting student object into login object
		login1.setStudent(st1);
		
		//calling the service
		loginService.saveAll(List.of(login,login1));*/
		
		//Getting the Login Information based on id
		Optional<Login> loginObj = loginDao.findById(1);
		if(loginObj.isPresent()) {
			Login loginObject = loginObj.get();
			System.out.println(loginObject);
			//System.out.println(loginObject.getStudent());
		}
	}
}
