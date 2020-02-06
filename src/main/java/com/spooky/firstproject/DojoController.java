package com.spooky.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo")
	public String hello(@RequestParam(value="q", required=false)String searchQuery) {
		if(searchQuery == null) {
			return "The dojo is awesome!";
		}
		return "You searched for: " + searchQuery;
	}
	
	@RequestMapping("/{location}")
	public String response(@PathVariable("location") String location) {
		if(location == "/burbank-dojo") {
			return "<h1>Burbank Dojo is located in Southern California.";
		}
		if(location == "/san-jose") {
			return "SJ dojo is the headquarters.";
		}
		return location;
		}
	}
