package com.example.management.service;

import java.util.List;

import com.example.management.entity.Student;

public interface StudentServiceDAO {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student); 
}
