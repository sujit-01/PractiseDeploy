package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/save")
public class PractiseController {
	@GetMapping("/home")
	public String home()
	{
		return "index";
	}

}
