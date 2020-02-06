package com.spooky.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
	@RequestMapping("")
	public String hello(@RequestParam(value="q", required=false)String searchQuery) {
		if(searchQuery == null) {
			return "Search for something pls";
		}
		return "You searched for: " + searchQuery;
	}
	
	@RequestMapping("/random/{track}/{module}/{lesson}")
	public String response(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson) {
		return "<h1>First String: " +track+" Second String: "+module+" Third String: "+lesson+"</h1>";
	}

}
