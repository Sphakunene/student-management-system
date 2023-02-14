package com.sms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.model.Student;
import com.sms.service.StudentServices;

@Controller
public class StudentController {
	
	private StudentServices studentServices;

	
	
	public StudentController(StudentServices studentServices) {
		super();
		this.studentServices = studentServices;
	}



	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students",studentServices.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		Student student = new Student();
		model.addAttribute("student",student);
		return "create_student";
	}
	@PostMapping("/students")
	public String saveStudents(@ModelAttribute("student") Student student) {
		
		studentServices.saveStudent(student);
		return "redirect:/students";
		
	}
	
}
