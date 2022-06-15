package com.example.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
