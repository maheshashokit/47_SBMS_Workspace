package com.ashokit.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.Enquiry;

public interface EnquiryDao extends CrudRepository<Enquiry, Serializable> {

}
