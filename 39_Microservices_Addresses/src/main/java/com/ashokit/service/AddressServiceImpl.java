package com.ashokit.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.ashokit.dao.AddressDao;
import com.ashokit.entity.Address;
import com.ashokit.request.AddressRequest;
import com.ashokit.response.AddressResponse;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private AddressDao addressDao;
	
	@Autowired
	private Environment environment;

	@Override
	public AddressResponse createAddress(AddressRequest request) {
		//converting from AddressRequest To Entity Class Object
		Address address = convertingFromRequestToEntity(request);
		
		//Saving Address Information
		Address savedAddress = this.addressDao.save(address);
		
		//Converting From Address Entity to AddressResponse Object
		return this.convertingEntityFromResponse(savedAddress);
	}

	@Override
	public AddressResponse getAddressById(Integer addressId) {
		Optional<Address> addressDetails = this.addressDao.findById(addressId);
		if (addressDetails.isPresent()) {
			Address addDetails = addressDetails.get();
			AddressResponse addressResponse = this.convertingEntityFromResponse(addDetails);
			return addressResponse;
		}else {
			//throw the exception
			return null;
		}
	}
	
	@Override
	public AddressResponse getAddressByCustomerId(Integer customerId) {
		System.out.println("PortNumber:::::" + environment.getProperty("server.port"));
		Optional<Address> addressDetails = this.addressDao.findByCustomerId(customerId);
		if (addressDetails.isPresent()) {
			Address addDetails = addressDetails.get();
			AddressResponse addressResponse = this.convertingEntityFromResponse(addDetails);
			return addressResponse;
		}else {
			//throw the exception
			return null;
		}
	}

	@Override
	public List<AddressResponse> getAllAddresses() {
		//Getting All Customers Details
		List<Address> allCustomers = this.addressDao.findAll();
		
		//converting from List<Address> into List<AddressResponse>
		List<AddressResponse> allAddressResponses = 
				allCustomers.stream()
				            .map(eachAddress -> {
				            		return convertingEntityFromResponse(eachAddress);
				            	})
							.collect(Collectors.toList());
		//returning CustomerResponse
		return allAddressResponses;
	}
	
	//utility method for converting AddressRequest to Entity Object
	private Address convertingFromRequestToEntity(AddressRequest addressRequest) {
		return this.modelMapper.map(addressRequest,Address.class);
	}
	
	//utility method for converting AddressResponse to Entity Object
	private AddressResponse convertingEntityFromResponse(Address address) {
		return this.modelMapper.map(address,AddressResponse.class);
	}


}
