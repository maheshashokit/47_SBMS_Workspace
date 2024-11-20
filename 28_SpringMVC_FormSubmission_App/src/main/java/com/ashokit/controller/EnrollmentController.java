package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.beans.Enquiry;

@Controller
public class EnrollmentController {
	
	
	@RequestMapping(value="/enrollment")
	public ModelAndView getHomePage() {
		ModelAndView mav = new ModelAndView("enrollment");
		//we are linking empty Java Bean object to form and make sure form request parameter 
		//and Java Bean property names must match
		mav.addObject("enrollmentObj", new Enquiry());
		return mav;
	}
	
	@RequestMapping(value="sendDetails", method = RequestMethod.POST)
	public ModelAndView processingEnrollment(@ModelAttribute("enrollmentObj") Enquiry enquiryDetails) {
		
		ModelAndView mav = new ModelAndView("confirmation");
		mav.addObject("courseEnquiryInfo", enquiryDetails);
		
		return mav;
		
	}

}
