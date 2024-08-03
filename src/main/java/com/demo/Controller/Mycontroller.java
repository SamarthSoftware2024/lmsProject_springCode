package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.Student;
import com.demo.Service.Myservice;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/students")
public class Mycontroller {
	
	@Autowired
	Myservice service;
	
	@PostMapping("register")
	public String registerStudent(@RequestBody Student student) {
		String message = service.register(student);
		return message;
	}
	
	@PostMapping("login/{id}")
	public String loginStudnet(@PathVariable int id, @RequestBody Student student) {
		
		String message= service.login(id,student);
		return message;
	}
	 @PostMapping("/login")
	    public String login(@RequestBody Student request) {
	        return service.login(request.getUserName(), request.getPassword());
	    }
}
