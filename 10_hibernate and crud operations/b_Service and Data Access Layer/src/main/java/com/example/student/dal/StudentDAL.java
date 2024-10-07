package com.example.student.dal;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.student.entity.Student;

@Repository
public class StudentDAL {
	
	@Autowired
	EntityManager entityManager;// to manage the transection 
	
	public void save(Student student) {
		
		//Get the Session object
		Session session = entityManager.unwrap(Session.class);
		session.save(student);//now hibernate will save the student object to database
	}

}
