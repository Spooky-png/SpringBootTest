package com.spooky.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/human")
public class HumanController {
	@RequestMapping("")
	public String hello(@RequestParam(value="firstName", required=false)String firstName, @RequestParam(value="lastName", required=false)String lastName) {
		if(firstName == null && lastName == null) {
			return "Hello Human! Welcome to Spring Boot!";
		}
		if(lastName == null) {
			return "Hello " + firstName+ "! Welcome to Spring Boot!";
		}
		if(firstName == null) {
			return "Hello " + lastName+ "! Welcome to Spring Boot!";
		}
		return "Hello " +firstName+" "+lastName+"! Welcome to Spring Boot!";
	}

}
