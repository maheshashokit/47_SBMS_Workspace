package com.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.dtos.Customer;
import com.ashokit.util.CustomerUtil;

@RestController
@RequestMapping("/api/customers")
public class CustomerResource {
	
	@Autowired
	private CustomerUtil customerUtil;
	
	//This Rest API will return all customers data
	//API URL >>> http://localhost:9090/api/customers/
	@GetMapping(value="/",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> allCustomers = customerUtil.getAllCustomers();
		return new ResponseEntity<List<Customer>>(allCustomers,HttpStatus.OK);
	}
	
	//This Rest API will return particular customer data based on pathvariable of customerId
	//API URL >>> http://localhost:9090/api/customers/{customerId}
	@GetMapping(value="/{customerId}/{customerLocation}")
	public ResponseEntity<?> getCustomerById(@PathVariable("customerId") String customerId,
											 @PathVariable("customerLocation") String customerLocation){
		List<Customer> allCustomers = customerUtil.getAllCustomers();
		Optional<Customer> customerData = allCustomers.stream()
													  .filter(eachCustomer -> customerId.equalsIgnoreCase(eachCustomer.getCustId()))
													  .findFirst();
		if(customerData.isPresent()) {
			Customer customer = customerData.get();
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Customer Data is not found......", HttpStatus.OK);
		}
		
	}
	
	//This Rest API will create resource/record based on Request body
	//API URL >>> http://localhost:9090/api/customers/
	@PostMapping(value="/",consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, 
			               produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> creatingCustomer(@RequestBody Customer customer){
		List<Customer> allCustomers = customerUtil.getAllCustomers();
		allCustomers.add(customer);
		//return new ResponseEntity<String>(customer.getCustId()+" Record Created Successfully.....",HttpStatus.CREATED);
		return new ResponseEntity<List<Customer>>(allCustomers,HttpStatus.CREATED);
	}
	
	//This Rest API will updating resource/record based on Request body
	//API URL >>> http://localhost:9090/api/customers/
	@PutMapping(value="/",consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
			              produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> updatingCustomerDetails(@RequestBody Customer customer){
		
		//Get All Customers
		List<Customer> allcustomers = customerUtil.getAllCustomers();
		
		//filtering the customer based on customerId in request body
		Optional<Customer> customerOpt = allcustomers.stream().filter(eachCustomer -> eachCustomer.getCustId().equals(customer.getCustId())).findFirst();
		
		if(customerOpt.isPresent()) {
			Customer currentCustomerDetails = customerOpt.get();
			System.out.println("Current Customer Details::::" + currentCustomerDetails);
			//modifying customerLocation from resource
			currentCustomerDetails.setCustLocation(customer.getCustLocation());
			System.out.println("After Updating Customer Details::::" + currentCustomerDetails);
			return new ResponseEntity<Customer>(currentCustomerDetails,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Customer Data Not Found With Supplied CustomerId...",HttpStatus.NO_CONTENT);
		}
	}
}
