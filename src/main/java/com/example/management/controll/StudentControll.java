package com.example.management.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.management.entity.Student;
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
	
	@GetMapping("/students/new")
	public String createNewStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
}
