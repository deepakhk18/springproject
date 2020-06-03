package com.example.springdemos.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="/demo")
public class Controller {
	@Autowired
	private UserRepository userRepository;
	@PatchMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String name , @RequestParam String email)
	{
		User n=new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "saved";
	}
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User>getAllUsers()
	{
		return userRepository.findAll();
	}
	
	

}
