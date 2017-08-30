package com.rzs.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/welcome")
	public String welcome (Model model) {
		model.addAttribute("greeting", "Welcome!!!");
		model.addAttribute("tagline", "This project implements Spring!!!");
		return "welcome";
	}
}
