package com.ashokit;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.controller.CustomerController;
import com.ashokit.dao.ProductDao;
import com.ashokit.dao.VehicleDao;
import com.ashokit.entity.Product;
import com.ashokit.entity.Vehicle;

//This is MySQL APplication
@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private CustomerController customerController;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private VehicleDao vehicleDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		//Preparing the one customer object
		/*Customer cust = new Customer();
		cust.setName("Ramesh");
		cust.setLocation("Hyderabad");
		cust.setEmailId("ramesh.ashokit@gmail.com");
		cust.setContactNo("123456");
		
		Customer cust1 = new Customer();
		cust1.setName("Rajesh");
		cust1.setLocation("Hyderabad");
		cust1.setEmailId("rajesh.ashokit@gmail.com");
		cust1.setContactNo("123456");
		
		Customer cust2 = new Customer();
		cust2.setName("Ramesh");
		cust2.setLocation("Hyderabad");
		cust2.setEmailId("rajesh.ashokit@gmail.com");
		cust2.setContactNo("123456");
		
		//Calling the controller class method
		//customerController.createNewCustomer(cust);
		customerController.createNewCustomers(List.of(cust1,cust2));
		//customerController.fetchCustomerDetailsById(11441);
		//customerController.fetchCustomersDetailsByIds(List.of(11441,99889));
		//customerController.fetchAllCustomers();
		
		Customer deleteCustomer = new Customer();
		deleteCustomer.setCustomerId(1144);
		//customerController.removedCustomer(deleteCustomer);
		
		//Internally 2-select queries & 2-delete queries
		//customerController.removeCustomers(List.of(456,9988));*/
		
		Product p = new Product();
		p.setProductName("Laptop");
		p.setProductPrice(50000.00f);
		
		Product p1 =new Product();
		p1.setProductName("Mobilephone");
		p1.setProductPrice(10000.00f);
		
		Iterable<Product> savedProducts = productDao.saveAll(Arrays.asList(p,p1));
		savedProducts.forEach(prod -> System.out.println(prod));   
		
		System.out.println("*****************************************************************");
		
		Vehicle  v1 = new Vehicle();
		v1.setVehicleName("Tata");
		v1.setVehicleCost(50000.00f);
		
		Vehicle v2 = new Vehicle();
		v2.setVehicleName("Hyundai");
		v2.setVehicleCost(60000.00f);
		
		Iterable<Vehicle> savedVehicles = vehicleDao.saveAll(Arrays.asList(v1,v2));
		savedVehicles.forEach(veh  -> System.out.println(veh));
		
	}

}
