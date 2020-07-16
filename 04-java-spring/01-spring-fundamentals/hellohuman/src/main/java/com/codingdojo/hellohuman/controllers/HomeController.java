package com.codingdojo.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name, @RequestParam(value="lastname", required=false) String lastname, Model model) {
		if(name == null) {
			model.addAttribute("name", "Human");
		} else {
			System.out.println(name);
			System.out.println(lastname);
			model.addAttribute("name", name);
			model.addAttribute("lastname", lastname);
		}
		return "humanindex.jsp";
	}
}
