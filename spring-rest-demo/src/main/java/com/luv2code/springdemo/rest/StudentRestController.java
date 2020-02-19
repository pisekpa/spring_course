package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	//define endpoint for "/student" - return list of student
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> theStudent = new ArrayList<>();
		
		theStudent.add(new Student("Poornima" , "Patel"));
		theStudent.add(new Student("Mario" , "Rossi"));
		theStudent.add(new Student("Mary" , "Smith"));
		
		return theStudent;
	}
}
