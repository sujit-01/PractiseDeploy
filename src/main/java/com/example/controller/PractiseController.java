package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class PractiseController {
	@GetMapping("/get")
	public String getValue()
	{
		return "Hello Sujit kumar";
	}

}
