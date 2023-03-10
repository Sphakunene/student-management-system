package com.sms.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.model.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentServices;

@Service
public class StudentServicesImp implements StudentServices {
	
	private StudentRepository studentRepository;
	
	public StudentServicesImp(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentbyId(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
	
		return studentRepository.save(student);
	}

	@Override
	public void deleteById(long id) {
		studentRepository.deleteById(id);
		
	}
	

}
