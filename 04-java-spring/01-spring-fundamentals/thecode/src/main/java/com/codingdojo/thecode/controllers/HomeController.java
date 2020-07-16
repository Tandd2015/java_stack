package com.codingdojo.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String indexLoadPage() {
		return "Index.jsp";
	}
	
	@PostMapping("/maybecode")
	public String attemptSubmit(@RequestParam(value="testpass") String testpass,
			Model model,
			RedirectAttributes redirectAttr) {
		if(isPassCode(testpass)) {			
			return "redirect:/code";
		}
		redirectAttr.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
		
	}
	
	@RequestMapping("/code")
	public String indexCodeLoadPage(Model model) {
		model.addAttribute("characterTraits", getCTraits());
		return "CodeIndex.jsp";
	}
	
	private Boolean isPassCode(String attempt) {
		return attempt.equals("bushido");
	}
	
	private String[] getCTraits() {
		return new String[] {
				"Loyalty",
				"Courage",
				"Veracity",
				"Compassion",
				"Honor"
		};
	}
}
