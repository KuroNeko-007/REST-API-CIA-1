package com.example.demo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	private String name;
	public void setName(String name) {
		this.name=name;
	}
	@GetMapping("/")
	public String getName() {
		setName("Gowtham-727721eucs032");
		return "Hi "+name;
	}
}

