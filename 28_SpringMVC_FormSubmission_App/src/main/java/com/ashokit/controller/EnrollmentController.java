package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.beans.Enquiry;
import com.ashokit.service.EnquiryService;

@Controller
public class EnrollmentController {
	
	@Autowired
	private EnquiryService enquriyService;

	
	@RequestMapping(value="/enrollment")
	public ModelAndView getHomePage() {
		ModelAndView mav = new ModelAndView("enrollment");
		//we are linking empty Java Bean object to form and make sure form request parameter 
		//and Java Bean property names must match
		mav.addObject("enrollmentObj", new Enquiry());
		return mav;
	}
	
	 /*@RequestMapping(value="sendDetails", method = RequestMethod.POST)
	 public ModelAndView processingEnrollment(@ModelAttribute("enrollmentObj") Enquiry enquiryDetails) {
		
		ModelAndView mav = new ModelAndView("confirmation");
		boolean savedEnquiryStatus = enquriyService.createNewEnquiry(enquiryDetails);
		if(savedEnquiryStatus) {
			mav.addObject("courseEnquiryInfo", enquiryDetails);
		}else {
			mav.addObject("courseEnquiryInfo", "Something went wrong Please reachout to +91-1234567890");
		}		
		return mav;		
	 }*/
	 
	 @RequestMapping(value="sendDetails", method = RequestMethod.POST)
	 public String processingEnrollment(@ModelAttribute("enrollmentObj") Enquiry enquiryDetails,
			                            RedirectAttributes redirectAttributes) {
		boolean savedEnquiryStatus = enquriyService.createNewEnquiry(enquiryDetails);
		if(savedEnquiryStatus) {
			redirectAttributes.addFlashAttribute("courseEnquiryInfo", enquiryDetails);
		}else{
			redirectAttributes.addFlashAttribute("courseEnquiryInfo", "Something went wrong Please reachout to +91-1234567890");
		}
		return "redirect:acknowledgement";
	 }
	 
	 @RequestMapping(value="acknowledgement",method=RequestMethod.GET)
	 public ModelAndView getConfirmation() {	
		ModelAndView mav = new ModelAndView("confirmation");
		return mav;		 
	 }

}