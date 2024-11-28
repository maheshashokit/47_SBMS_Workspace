package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.beans.EnquiryDTO;
import com.ashokit.services.EnquiryService;

@Controller
@RequestMapping("/enquiry")
public class EnquiryController {
	
	@Autowired
	private EnquiryService enquiryService;
	
	@GetMapping(value="/")
	public ModelAndView getHomePage() {
		ModelAndView mav = new ModelAndView("enquiryDetails");
		//Binding the Form with Java Object
		mav.addObject("enquiryForm", new EnquiryDTO());
		return mav;
	}
	
	@PostMapping(value="processEnquiry")
	public String handleEnquiry(@ModelAttribute("enquiryForm") EnquiryDTO enquirydto,ModelMap map) {
		
		//EnquiryDTO contains form data 
		 EnquiryDTO enquiry = enquiryService.createEnquiry(enquirydto);
		 map.addAttribute("enquiry", enquiry);
		 return "enquiryInfo";
	}

}
