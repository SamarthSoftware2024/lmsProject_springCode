package com.demo.ServiceImp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.Entity.Student;
import com.demo.Repo.StudentRepo;
import com.demo.Service.Myservice;

@Component
public class MyServiceImp implements Myservice{
	
	@Autowired
	StudentRepo repo;

	
	@Override
	public String register(Student student) {
		repo.save(student);
		return "Registration successfully";
		
	}


	@Override
	public String login(int id, Student student) {
	    Optional<Student> optionalStudent = repo.findById(id);

	    if (optionalStudent.isPresent()) {
	        Student std = optionalStudent.get();

	        if (std.getUserName().equals(student.getUserName()) &&
	            std.getPassword().equals(student.getPassword())) {
	            return "login successfully";
	        } else if(std.getUserName().equals(student.getUserName())) {
	        	return "enter correct password";
	        } else if(std.getPassword().equals(student.getPassword())) {
	        	return "enter correct username";
	        }
	         else {
	            return "login failed";
	        }
	    } else {
	        return "student not found";
	    }
	}

}
