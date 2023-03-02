package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.ApiRepository;

@Service
public class ApiService {

	@Autowired
	ApiRepository  repository;
	
	public Optional<Student> get(int id){
		return repository.findById(id);
	}
	public String updateDetails(Student family) {
		repository.save(family);
		return "updated";
	}
	public String deleteDetails(int id) {
		repository.deleteById(id);
		return "id Deleted";
	}
}
