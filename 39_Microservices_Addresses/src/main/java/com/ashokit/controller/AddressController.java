package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.request.AddressRequest;
import com.ashokit.response.AddressResponse;
import com.ashokit.response.AddressResponseList;
import com.ashokit.service.AddressService;

@RestController
@RequestMapping(value = "/api/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping(value = "/")
	public ResponseEntity<?> fetchAllAddresses(){
		List<AddressResponse> allAddress = addressService.getAllAddresses();
		
		//converting List<AddressResponse> into AddressResponseList
		AddressResponseList addressResponseList = new AddressResponseList();
		addressResponseList.setAddressResponseList(allAddress);
		
		return ResponseEntity.ok(addressResponseList);
	}
	
	@GetMapping(value = "/{addressId}")
	public ResponseEntity<?> fetchAddressById(@PathVariable("addressId") Integer addressId){
		AddressResponse customerDetails = addressService.getAddressById(addressId);
		return ResponseEntity.ok(customerDetails);
	}
	
	@GetMapping(value = "/customer/{customerId}")
	public ResponseEntity<?> fetchAddressByCustomerId(@PathVariable("customerId") Integer customerId){
		AddressResponse customerDetails = addressService.getAddressByCustomerId(customerId);
		return ResponseEntity.ok(customerDetails);
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<?> createNewAddressForCustomer(@RequestBody AddressRequest addressRequest){
		AddressResponse newCustomerDetails = addressService.createAddress(addressRequest);
		return new ResponseEntity<>(newCustomerDetails, HttpStatus.CREATED);
	}	
}
