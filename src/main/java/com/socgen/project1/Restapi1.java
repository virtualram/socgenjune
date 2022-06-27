package com.socgen.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restapi1 {
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
	
	@RequestMapping(value = "/createuser",method=RequestMethod.POST, headers = "Accept=application/json"  )
	public User createuser(@RequestBody User usr) {
		User usr1  = new User();
		usr1.setUsername(usr.getUsername());
		usr1.setEmail(usr.getEmail());
		return usr1;
		
	}

}
