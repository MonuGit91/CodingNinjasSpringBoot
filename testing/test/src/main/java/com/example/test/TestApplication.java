package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TestApplication.class, args);
		School school = context.getBean(School.class);
		System.out.println(school.student.getDetails());
	}
}
