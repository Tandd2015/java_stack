package com.codingdojo.languages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class LanguageController {
	
	private final LanguageService languageService;
	
	public LanguageController(LanguageService service){
		languageService = service;
	}
	
	// Get all Languages
	@RequestMapping("")
	public String index(Model model, @ModelAttribute("language") Language language) {
		model.addAttribute("languages", languageService.allLanguages());
		return "/languages/index.jsp";
	}
	
	// create a new Language
	@PostMapping("")
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "/languages/index.jsp";
		}
		languageService.createLanguage(language);
		return "redirect:/languages";
	}
	
	// show one Language
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", languageService.findOLanguage(id));
		return "/languages/show.jsp";
	}
	
	// delete one Language
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Long id) {
		languageService.deleteOLanguage(id);
		return "redirect:/languages";
	}
	
	// get one language to update
	@RequestMapping("/{id}/edit")
	public String indexEdit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", languageService.findOLanguage(id));
		return "/languages/edit.jsp";
	}
	
	//  update one language put
	@PutMapping("/{id}")
	public String update(@Valid @PathVariable("id") Long id, @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "/languages/edit.jsp";
		} else {
			languageService.updateOLanguage(language);
			return "redirect:/languages";
		}
	}
	
	
}
