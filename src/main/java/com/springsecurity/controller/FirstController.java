package com.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // sets up this class as spring mvc controller
public class FirstController {

	@GetMapping("/")
	public String showHome(){
		return "home";
	}
}
