package com.codingNinjas.codingNinjasApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PaidCourse implements Course {

	String courseName;
	Instructor courseInstructor;
	UserList userList;

	@Override
	public void setCourseDetails(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public UserList getUserList() {
		return this.userList;
	}

	@Override
	public Instructor getInstructor() {
		return this.courseInstructor;
	}

	@Override
	public String getCourseName() {
		return this.courseName;
	}

}
