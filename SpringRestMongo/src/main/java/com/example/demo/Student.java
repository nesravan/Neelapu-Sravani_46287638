package com.example.demo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "student")
public class Student {

	    @Id
	    private long id;
	    private String name;
	    private double age;
	    private String grade;

	    public Student() {
	        super();

	    }
	    public Student(String name, double age, String grade) {
	        super();
	        this.name = name;
	        this.age = age;
	        this.grade = grade;
	    }
	    public long getId() {
	        return id;
	    }
	    public void setId(long id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public double getAge() {
	        return age;
	    }
	    public void setAge(double age) {
	        this.age = age;
	    }
	    public String getGrade() {
	        return grade;
	    }
	    public void setGrade(String grade) {
	        this.grade = grade;
	    }


	}

