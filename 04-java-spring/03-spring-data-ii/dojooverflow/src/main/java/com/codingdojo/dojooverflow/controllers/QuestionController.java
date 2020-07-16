package com.codingdojo.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojooverflow.models.AltQuestion;
import com.codingdojo.dojooverflow.models.Answer;
import com.codingdojo.dojooverflow.services.AnswerService;
import com.codingdojo.dojooverflow.services.QuestionService;

@Controller
@RequestMapping("/questions")
public class QuestionController {
	private final QuestionService qServ;
	private final AnswerService aServ;
	
	public QuestionController(QuestionService qServ, AnswerService aServ) {
		this.qServ = qServ;
		this.aServ = aServ;
	}
	
	@GetMapping("")
	public String disDashPage(Model model) {
		model.addAttribute("questions", this.qServ.allQuestions());
		return "questions/Dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String newQPage(@ModelAttribute("insertQ") AltQuestion insertQ) {
		return "questions/AddQuestion.jsp";
	}
	
	@PostMapping("/new")
	public String newQPost(@Valid @ModelAttribute("insertQ") AltQuestion insertQ, BindingResult result) {
		if(result.hasErrors()) {
			return "questions/AddQuestion.jsp";
		} else {
			this.qServ.newQuestion(insertQ);
			return "redirect:/questions";
		}
	}
}
