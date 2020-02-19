package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			
			//created object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read JSON file and map/ convert to Java POJO:
			//data/sample-lite.json
			
			//print first name and lastname
			Student theStudent = mapper.readValue(
					        //         new File("data/sample-lite.json"), Student.class);
					  				   new File("data/sample-full.json"), Student.class);
			
			//print first name and last name
			System.out.println("First name = " + theStudent.getfirstName());
			System.out.println("Last name name = " + theStudent.getLastName());
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
