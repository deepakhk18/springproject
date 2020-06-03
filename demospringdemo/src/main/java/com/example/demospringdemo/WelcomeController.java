package com.example.demospringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	
	@RestController
	public class WelcomeController {
		
	    @Autowired 
		private WelcomeService service;
		
	    @RequestMapping("/welcome")
		public String welcome() {
			return service.retrieveWelcomeMessage();
		}
	}
	



