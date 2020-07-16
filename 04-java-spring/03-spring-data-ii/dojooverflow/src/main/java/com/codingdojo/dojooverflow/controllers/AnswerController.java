package com.codingdojo.dojooverflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojooverflow.models.Answer;
import com.codingdojo.dojooverflow.services.AnswerService;
import com.codingdojo.dojooverflow.services.QuestionService;
import com.codingdojo.dojooverflow.services.TagService;

import net.bytebuddy.asm.Advice.This;

@Controller
@RequestMapping("/questions")
public class AnswerController {
	private final AnswerService aServ;
	private final QuestionService qServ;
	private final TagService tServ;
	
	public AnswerController(AnswerService aServ, QuestionService qServ, TagService tServ) {
		this.aServ = aServ;
		this.qServ = qServ;
		this.tServ = tServ;
	}

	@PostMapping("/answers")
	public String newQCPost(@ModelAttribute("answer") Answer answer, BindingResult result) {
		if(result.hasErrors()) {
			return "questions/AddQuestion.jsp";
		} else {
			Answer aNs = this.aServ.createAnswer(answer);
			return "redirect:/questions/" + aNs.getQuestion().getId();
		}
	}
	
	@GetMapping("/{id}")
	public String showOneQ(@PathVariable("id") Long id, @ModelAttribute("answer") Answer answer, Model model) {
		model.addAttribute("question", this.qServ.oneQuestion(id));
		model.addAttribute("answers", this.qServ.oneQuestion(id).getAnswers());
		return "questions/AddAnswer.jsp";
	}
	
}
