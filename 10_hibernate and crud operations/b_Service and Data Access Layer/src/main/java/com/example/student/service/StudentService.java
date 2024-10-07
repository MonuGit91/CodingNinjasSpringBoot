package com.example.student.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.dal.StudentDAL;
import com.example.student.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDAL studentDAL;//(student data access layer)
	
	@Transactional
	public void save(Student student)
	{
		studentDAL.save(student);
	}
}
