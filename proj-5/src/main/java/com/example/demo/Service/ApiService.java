package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.EmployeeRepo;


@Service
public class ApiService {
	@Autowired
	EmployeeRepo repository;
	public Optional<Student> getStudent(int roll){
		return repository.findById(roll);
	}
}
