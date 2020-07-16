package com.codingdojo.driverslicense.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.driverslicense.models.Person;
import com.codingdojo.driverslicense.models.License;
import com.codingdojo.driverslicense.services.LicenseService;
import com.codingdojo.driverslicense.services.PersonService;

@Controller
@RequestMapping("/licenses")
public class LicenseController {
	
	private final LicenseService licenseService;
	private final PersonService personService;
	
	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	
	@RequestMapping("/new")
	public String displayLicenseForm(@ModelAttribute("license") License license, Model model) {
		model.addAttribute("persons", personService.allPerson());
		return "License/NewLicense.jsp";
	}

	@PostMapping("/new")
	public String submitLicenseForm(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "License/NewLicense.jsp";
		} else {
			licenseService.createLicense(license);
			return "redirect:/persons";
		}
	}
}
