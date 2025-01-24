package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
//@EnableFeignClients
//@EnableDiscoveryClient
public class Application implements CommandLineRunner{
	
	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		String welcomeMessage = environment.getProperty("welcome.message");
		System.out.println(welcomeMessage);
	}

}

/*
 {
    "id": 102,
    "name": "Raghav",
    "location": "Mumbai",
    "gender": "Male",
    "emailId": "Raghav.ashokit@gmail.com",
    "contactNo": "123456",
    "createdDate": "2023-10-03T07:07:53.902898",
    "addressResponse": {
        "id": 102,
        "doorNo": "11-22-31",
        "cityName": "Mumbai",
        "pincode": "11112222",
        "created_dt": "2023-10-03T06:54:48.791329",
        "customerId": 5253
    }
*/

/*
{
"customerDetails": {
    "id": 1,
    "name": "Ramesh",
    "location": "Hyderabad",
    "gender": "Male",
    "emailId": "ramesh.ashokit@gmail.com",
    "contactNo": "123456",
    "createdDate": "2023-09-30T07:11:56.55403"
},
"addressDetails": {
    "id": 1,
    "doorNo": "1-2-3",
    "cityName": "Hyderabad",
    "pincode": "123456",
    "created_dt": "2023-10-03T06:40:47.917831",
    "customerId": 1
}
}
*/