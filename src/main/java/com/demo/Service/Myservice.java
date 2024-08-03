package com.demo.Service;

import org.springframework.stereotype.Service;

import com.demo.Entity.Student;

@Service
public interface Myservice {
	
	public String register(Student student);
	
	public String login(int id, Student student);

	public String login(String userName, String password);
	

}
