package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homeresource {
	
	
	@GetMapping("/")
	public String home() {
		
		return ("<h1>Welcome</h>");
		
	}
	@GetMapping("/user")
	public String User() {
		
		return ("<h1>Welcome User</h>");
	}
	
	@GetMapping("/admin")
	public String Admin() {
		
		return ("<h1>Welcome Admin</h>");
	}

}