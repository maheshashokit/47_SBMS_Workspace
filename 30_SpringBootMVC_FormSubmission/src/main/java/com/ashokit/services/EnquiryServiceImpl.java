package com.ashokit.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.beans.EnquiryDTO;
import com.ashokit.dao.EnquiryDao;
import com.ashokit.entity.Enquiry;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private EnquiryDao enquiryDao;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public EnquiryDTO createEnquiry(EnquiryDTO enquirydto) {

		//converting the form data into Entity object data for persisting database
		Enquiry enquiry = modelMapper.map(enquirydto, Enquiry.class);
		enquiry.setCreatedDate(new java.util.Date());
		
		//saving the data into database
		Enquiry savedEnquiry = enquiryDao.save(enquiry);

		return modelMapper.map(savedEnquiry, EnquiryDTO.class);
	}
}
