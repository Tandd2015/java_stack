package com.codingdojo.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosandninjas.models.NinjaModel;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	
	private NinjaService ninjaService;
	private DojoService dojoService;
	
	public NinjaController(NinjaService ninjaService, DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	
	@GetMapping("/new")
	public String displayNinjaFormPage(@ModelAttribute("ninja") NinjaModel ninjaModel, Model model) {
		model.addAttribute("dojos", dojoService.findAllDojoModels());
		return "Ninja/NewNinja.jsp";
	}
	
	@PostMapping("/new")
	public String createNinjaModelForm(@Valid @ModelAttribute("ninja") NinjaModel ninjaModel, BindingResult result) {
		if(result.hasErrors()) {
			return "Ninja/NewNinja.jsp";
		} else {
			this.ninjaService.CreateNinjaModel(ninjaModel);
			return "redirect:/dojos/"+ this.ninjaService.CreateNinjaModel(ninjaModel).getDojoModel().getId();
		}
	}
}
