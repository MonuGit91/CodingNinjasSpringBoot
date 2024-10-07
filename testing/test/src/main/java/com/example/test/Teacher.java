package com.example.test;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements User {
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return name;
	}

}
