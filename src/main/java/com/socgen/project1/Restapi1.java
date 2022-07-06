package com.socgen.project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restapi1 {
	
	@Autowired
	Userrepository usrrep;
	
	@Autowired
	Skillrepository skillrep;
	
	@Autowired
	Departmentrepository deptrep;
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
	
	@RequestMapping(value = "/createuser",method=RequestMethod.POST, headers = "Accept=application/json"  )
	public User createuser(@RequestBody User usr) {
		User usr1  = new User();
		usr1.setUsername(usr.getUsername());
		usr1.setEmail(usr.getEmail());
		
       Department dep = new Department();
       dep =deptrep.findByname("finance");
       
       List<Skills> sks = new ArrayList<Skills>(); 
    		sks=   skillrep.findAll();
  
    		
    		
    		 
    		usr1.setSkills(sks); 
 
		usr1.setDept(dep);
		usrrep.save(usr1);
		return usr1;
		
	}
	
	@RequestMapping(value = "/updateuser",method=RequestMethod.POST, headers = "Accept=application/json"  )
	public User updateuser(@RequestBody User usr) {
		User usr1  =new User();
		
	   usr1 = usrrep.findByusername(usr.getUsername());
		
		usr1.setEmail(usr.getEmail());
		usrrep.save(usr1);
		return usr1;
	}
	
	@RequestMapping(value = "/searchuser",method=RequestMethod.POST, headers = "Accept=application/json"  )
	public List<User> searchuser(@RequestBody User usr) {
		
		return usrrep.findByusernameLike(usr.getUsername());
		
	}

	
	@RequestMapping(value = "/createdept",method=RequestMethod.POST, headers = "Accept=application/json"  )
	public Department createdept(@RequestBody Department dept) {
		
		deptrep.save(dept);
		return dept;
		
	}
	@RequestMapping(value = "/createskill",method=RequestMethod.POST, headers = "Accept=application/json"  )
	public Skills createskill(@RequestBody Skills skills) {
		
		skillrep.save(skills);
		return skills;
		
	}


}
