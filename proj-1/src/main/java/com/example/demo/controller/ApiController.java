package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;

@RestController
public class ApiController {
	public List<Address> createAdd(){
		
		List<Address> detailsList=new ArrayList<Address>();
		detailsList.add(new Address(1,"ess","A"));
	 detailsList.add(new Address(2,"iss","b")); 
	 detailsList.add(new Address(4,"fgss","c")); 
	 detailsList.add(new Address(2,"iss","b")); 
	 detailsList.add(new Address(2,"iss","b")); 
	 detailsList.add(new Address(4,"fgss","c"));
	 detailsList.add(new Address(4,"fgss","c")); 
	 detailsList.add(new Address(2,"iss","b")); 
	 detailsList.add(new Address(4,"fgss","c"));
	 return detailsList;
	}
	 
@GetMapping("/")
public List<Address> getAddress() {
	return createAdd();
	}
}
