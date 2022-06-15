package com.example.management.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.management.service.StudentService;

@Controller
public class StudentControll {
	
	@Autowired
	private StudentService studentService;

	public StudentControll(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
		
	}
	
}
