package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	//define @PostConstruct to load the student data ... only once!
	
	@PostConstruct
	public void loadData() {
		
	    theStudents = new ArrayList<>();	
		theStudents.add(new Student("Poornima" , "Patel"));
		theStudents.add(new Student("Mario" , "Rossi"));
		theStudents.add(new Student("Mary" , "Smith"));
		
	}

	//define endpoint for "/student" - return list of student
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
//		List<Student> theStudents = new ArrayList<>();		
//		theStudents.add(new Student("Poornima" , "Patel"));
//		theStudents.add(new Student("Mario" , "Rossi"));
//		theStudents.add(new Student("Mary" , "Smith"));
		
		return theStudents;
	}
}
