package com.ashokit.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ashokit.response.AddressResponse;
import com.ashokit.response.AddressResponseList;

//@FeignClient(name="ADDRESS-SERVICE", path="/api/address")
@FeignClient(url="${address.service.name.url}",name="Address-Service")
public interface AddressClient {
	
	@GetMapping(value = "/customer/{customerId}")
	public ResponseEntity<AddressResponse> fetchAddressByCustomerId(@PathVariable("customerId") Integer customerId);
	
	@GetMapping(value = "/")
	public ResponseEntity<AddressResponseList> fetchAllAddresses();
	
}