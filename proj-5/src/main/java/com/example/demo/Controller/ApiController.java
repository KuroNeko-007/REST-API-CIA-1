package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.EmployeeRepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {

	@Autowired
	EmployeeRepo serviceRepository;
	@Autowired
	ApiService service;
	
	@GetMapping("/get")
	List<Student> getList(){
		return serviceRepository.findAll();
	}
	@GetMapping("/get/{id}")
	public Optional<Student> getbyid(@PathVariable int id){
		return service.getStudent(id);
	}
	@PostMapping("/post")
	public Student create(@RequestBody Student emp) {
		return serviceRepository.save(emp);
		
	}
	
}
