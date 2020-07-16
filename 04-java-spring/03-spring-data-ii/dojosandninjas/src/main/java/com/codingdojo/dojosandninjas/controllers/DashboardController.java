package com.codingdojo.dojosandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
public class DashboardController {
	
	private DojoService dojoService;
	
	private NinjaService ninjaService;
	
	public DashboardController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@GetMapping("/dojos/{id}")
	public String displayIndexTablePage(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojoModel", dojoService.findOneDojoModel(id));
		model.addAttribute("ninjas", ninjaService.findAllNinjaModels());
		return "Dashboard/CountDojoNinjas.jsp";
	}
	
}
