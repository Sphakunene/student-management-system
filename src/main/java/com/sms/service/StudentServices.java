package com.sms.service;

import java.util.List;

import com.sms.model.Student;

public interface StudentServices {

	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentbyId(Long id);
	Student updateStudent(Student student);
	void deleteById(long id);
	
}
