package com.example.demospringdemo;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
		
		public String retrieveWelcomeMessage() {
			
			return "Good Morning updated";
		}
	}


