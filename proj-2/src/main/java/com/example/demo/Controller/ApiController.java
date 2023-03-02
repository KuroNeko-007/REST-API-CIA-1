package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Repository.ApiRepository;
import com.example.demo.Service.ApiService;


@RestController
public class ApiController {

	@Autowired
	ApiRepository serviceRepository;
	@Autowired
	ApiService service;
	@GetMapping("/")
	List<Student> getList(){
		return serviceRepository.findAll();
	}
	@PostMapping("/")
	public Student create(@RequestBody Student family) {
		return serviceRepository.save(family);
	}
	@GetMapping("/{id}")
	public Optional<Student> getbyid(@PathVariable int id){
		return service.get(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody Student family) {
		return service.updateDetails(family);
	}
	@DeleteMapping("/{id}")
		public String delete(@PathVariable int id) {
			return service.deleteDetails(id);
		}
}
