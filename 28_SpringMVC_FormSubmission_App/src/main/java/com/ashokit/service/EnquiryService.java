package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.beans.Enquiry;
import com.ashokit.dao.EnquiryDao;

@Service
public class EnquiryService {
	
	@Autowired
	private EnquiryDao enquiryDao;
	
	public boolean createNewEnquiry(Enquiry enquiry) {
		return enquiryDao.saveEnquiryDetails(enquiry);
	}

}
