package com.learngn.swagger2learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/user")
public class UserController {
	
	@GetMapping
	public String getUser(){ 
		return "Teja";
	}
	
	@GetMapping("/{userName}")
	public String getUser(@PathVariable("userName") final String userName) {
		return userName;
	}
	
}

	
	

