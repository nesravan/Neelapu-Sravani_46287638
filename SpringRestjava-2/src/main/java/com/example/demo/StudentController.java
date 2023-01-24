package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	//http://localhost:8080

	@GetMapping("/student")
	public Student getStudent() {

		return new Student("Sravani", "Neelapu");
}
		@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> students = new ArrayList<>();
				students.add(new Student("Sravani","Neelapu"));
				students.add(new Student("Gracely","Ganta"));
				students.add(new Student("Saritha","Nakkini"));
				students.add(new Student("Akhila","Nagini"));
				students.add(new Student("chaitanya","laxshmi"));
				return students;
				
	}
}
