package com.ashokit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.beans.Enquiry;

@Controller
public class EnquiryController {
	
	
	 //RequestProcessorMethod for returning enquiry page
	 @RequestMapping(value="/")
	 public ModelAndView getHomePage() {
		 //logical view page name i.e.,enquiry.jsp >>>> enquiry components
		 return new ModelAndView("enquiry");
	 }
	 
	 @RequestMapping(value="courseEnquiry",method = RequestMethod.POST)
	 public ModelAndView processEnquiryDetails(@RequestParam Map<String,String> formData) {
		 ModelAndView mav = new ModelAndView("confirmation");
		 mav.addObject("courseEnquiryInfo", formData);
		 return mav;		 
	 }
	 
	 @RequestMapping(value="sendEnquiry",method = RequestMethod.POST)
	 public ModelAndView sendEnquiryDetails(@RequestParam Map<String,String> formData) {
		 
		 //Created the Enquiry object and setting form data
		 Enquiry enq =  new Enquiry();
		 enq.setFirstName(formData.get("firstName"));;
		 enq.setEmailId(formData.get("emailId"));
		 enq.setContactNo(formData.get("contactNo"));
		 enq.setCourse(formData.get("course"));		 
		 
		 ModelAndView mav = new ModelAndView("confirmation");
		 mav.addObject("courseEnquiryInfo", enq);
		 return mav;		 
	 }
}
