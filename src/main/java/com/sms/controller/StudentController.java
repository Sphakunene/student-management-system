package com.sms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
