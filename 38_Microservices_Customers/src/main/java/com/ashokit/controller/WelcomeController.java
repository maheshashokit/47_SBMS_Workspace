package com.ashokit.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/welcome")
@Slf4j
public class WelcomeController {

	//private static Logger log = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/{username}")
	public ResponseEntity<String> getWelcome(@PathVariable("username") String username){
		log.debug("This is for Debug Message");
		log.info("This is for Information Message");
		log.error("This is for Error Message");
		log.trace("This is for Trace Message");
		log.warn("This is for Warn Message");
		String message = null;
		message.length();
		return new ResponseEntity<String>("Welcome To AshokIT"+username,HttpStatus.OK);
	}

}