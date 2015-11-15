package com.borrowhut.ws.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Home.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String startapllication() {
		LOGGER.debug("Received request to list all users");
		LOGGER.info("inside method the value got is ");
		
		return "Borrowhut web service is up and running ";
	}
}
