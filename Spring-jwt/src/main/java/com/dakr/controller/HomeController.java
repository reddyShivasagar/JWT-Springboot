package com.dakr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.model.User;
import com.dakr.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	
	//http://localhost:8081/home/user 
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getUser() {
		
		System.out.println("Getting Users");
		return userService.getUser();
		
	}

}
