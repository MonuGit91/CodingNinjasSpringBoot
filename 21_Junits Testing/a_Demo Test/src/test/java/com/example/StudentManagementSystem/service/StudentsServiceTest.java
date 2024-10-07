package com.example.StudentManagementSystem.service;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.StudentManagementSystem.repository.StudentsDal;

@SpringBootTest
public class StudentsServiceTest {

	StudentsDal studentsDal = Mockito.mock(StudentsDal.class);

	@Test
	public void shouldTestIncreementService() {
		StudentsService	studentsService = new StudentsService(studentsDal);

		int num = 0;
		int result = studentsService.increementService(num);
		Assertions.assertEquals(result, num+1);
	}
	
	@Test
	public void shouldFailTestIncreementService() {
		StudentsService	studentsService = new StudentsService(studentsDal);
		int num = 0;
		int result = studentsService.increementService(num);
		Assertions.assertNotEquals(result, num);
	}

}
