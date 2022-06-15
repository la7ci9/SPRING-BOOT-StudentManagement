package com.example.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.management.entity.Student;
import com.example.management.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceDAO{

	private StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	
}
