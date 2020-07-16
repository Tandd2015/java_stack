package com.codingdojo.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.driverslicense.models.License;
import com.codingdojo.driverslicense.models.Person;
import com.codingdojo.driverslicense.services.LicenseService;
import com.codingdojo.driverslicense.services.PersonService;

@Controller
@RequestMapping("/persons")
public class PersonController {
	
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public PersonController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	@RequestMapping("")
	public String showAllPerson(Model model) {
		List<Person> allPerson = personService.allPerson();
		model.addAttribute("persons", allPerson);
		return "Dashboard/IndexDashboard.jsp";
	}
	
	@RequestMapping("/new")
	public String displayPersonForm(@ModelAttribute("person") Person person) {
		return "Person/NewPerson.jsp";
	}
	
	@PostMapping("/new")
	public String submitPersonForm(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "Person/NewPerson.jsp";
		} else {
			personService.createOnePerson(person);
			return "redirect:/persons";
		}
	}
	
	@RequestMapping("/{id}")
	public String showOnePerson(@PathVariable("id") Long id, Person person, Model model) {
		model.addAttribute("person", personService.findOnePerson(id));
		return "Person/ShowPerson.jsp";
	}
}
