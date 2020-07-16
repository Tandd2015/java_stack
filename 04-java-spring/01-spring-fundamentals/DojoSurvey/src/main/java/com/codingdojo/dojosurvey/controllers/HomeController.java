package com.codingdojo.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.dojosurvey.models.Survey;

@Controller
public class HomeController {	
	private String[] getLanguage() {
		return new String[] {
				"Python",
				"Flask",
				"JQuery",
				"JavaScript",
				"CSS",
				"BootStrap",
				"Java",
				"HTML"
			};
	}
	private String[] getLocation() {
		return new String[] {
				"Seattle, WA ",
				"Tysons Corner, VA ",
				"Los Angeles, CA ",
				"Tulsa, OK ",
				"Silicon Valley, CA ",
				"Chicago, IL ",
				"Dallas, TX ",
				"East Bay, CA "
			};
	}
	@RequestMapping("/")
	public String indexDojoSurvey(Model model) {
		model.addAttribute("favoriteList", getLanguage());
		model.addAttribute("locationsList", getLocation());
		return "Index.jsp";
	}
	@PostMapping("/result")
	public String formResults(@RequestParam("firstName") String firstName,
			@RequestParam(value="lastName") String lastName,
			@RequestParam(value="dojoLocation") String dojoLocation,
			@RequestParam(value="favoriteLanguage") String favoriteLanguage,
			@RequestParam(value="textArea") String textArea,
			Model model) {
		model.addAttribute("resultInfo", new Survey(firstName, lastName, dojoLocation, favoriteLanguage, textArea));
		return "Result.jsp";
	}
}
