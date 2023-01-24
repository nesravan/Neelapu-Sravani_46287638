package com.example.demo;
import org.springframework.data.mongodb.repository.MongoRepository;



import org.springframework.stereotype.Repository;

 

import com.example.demo.Student;
@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {

	 

	}

