package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Autowired
	Student student;
	@Autowired 
	Teacher teacher;
}
