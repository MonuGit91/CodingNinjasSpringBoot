package com.example.StudentManagementSystem.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.StudentManagementSystem.model.Student;

@DataJpaTest
@ActiveProfiles("test")
public class StudentsDalTestEmbedded {
	@Autowired
	private StudentsDal studentsDal;
	
	@Test
	@Order(1)
	public void shouldSaveStudent() {
		Student student = new Student(1, 
				"Rakesh", 
				19, 
				"JUnit", 
				"Aryabhatta Hostels", 
				"rakesh@gmail.com", 
				"09874562134");
		
		Student resultStudent = studentsDal.save(student);
		assertThat(resultStudent)
			.usingRecursiveComparison()
			.ignoringFields("sid")
			.isEqualTo(student);
	}
}
