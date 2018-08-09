package com.learngn.swagger2learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/hello")
@Api(value= "HelloworldResource", description= "shows hello world application")
public class WebController {
	
	
	@ApiOperation(value = "Returns Hello World")
	@ApiResponses(value = {
			@ApiResponse(code = 100, message= "100 is the message"),
			@ApiResponse(code = 200, message= "200 is the message")
	})
	@GetMapping
	public String Hello() {
		return "Hello World";
	}

	@PostMapping("/post")
	public String helloPost(@RequestBody final String hello) {
		return hello;
	}
	
	@PutMapping
	public String helloPut(@RequestBody final String hello) {
		return hello;
	}
	
}
