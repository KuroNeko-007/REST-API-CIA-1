package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Family;
	@RestController
	public class ApiController {
	public List<Family> createFamily(){
		List<Family> l=new ArrayList<>();
		l.add(new Family("hii",18,"mother"));
		l.add(new Family("safksm",15,"father"));
		l.add(new Family("sauiasf",36,"Mother"));
		l.add(new Family("safj",13,"sister"));
		l.add(new Family("uoaafm",40,"Father"));
		return l;
	}
	@GetMapping("/")
	public List<Family> getFamiltDetails(){
		return createFamily();
	}
}

