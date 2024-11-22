package com.ashokit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ashokit.beans.Enquiry;

@Repository
public class EnquiryDaoImpl implements EnquiryDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean saveEnquiryDetails(Enquiry enquiry) {
		int rowAffected = jdbcTemplate.update(
				"insert into ashokit_enquires values(ashokit_enquires_seq.nextval,?,?,?,?,sysdate)", enquiry.getFirstName(),
				enquiry.getEmailId(), enquiry.getContactNo(), enquiry.getCourse());
		return rowAffected != 0;
	}

}
