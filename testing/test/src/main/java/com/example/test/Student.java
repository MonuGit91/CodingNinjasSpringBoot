package com.example.test;

import org.springframework.stereotype.Component;

@Component
public class Student implements User{
	String name;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public String getDetails() {
		return name;
	}

}
