package com.codingdojo.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosandninjas.models.DojoModel;
import com.codingdojo.dojosandninjas.services.DojoService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	
	private DojoService dojoService;
	
	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	@GetMapping("/new")
	public String displayDojoFormPage(@ModelAttribute("dojo") DojoModel dojoModel) {
		return "Dojo/NewDojo.jsp";
	}
	
	@PostMapping("/new")
	public String createDojoModelForm(@Valid @ModelAttribute("dojo") DojoModel dojoModel, BindingResult result) {
		if(result.hasErrors()) {
			return "Dojo/NewDojo.jsp";
		} else {
			this.dojoService.createDojoModel(dojoModel);
			return "redirect:/dojos/"+this.dojoService.createDojoModel(dojoModel).getId();
		}
	}
}
