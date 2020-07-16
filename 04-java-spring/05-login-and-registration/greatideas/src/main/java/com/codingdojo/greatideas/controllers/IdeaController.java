package com.codingdojo.greatideas.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.greatideas.models.IdeaModel;
import com.codingdojo.greatideas.models.UserModel;
import com.codingdojo.greatideas.services.IdeaServices;
import com.codingdojo.greatideas.services.UserServices;
import com.codingdojo.greatideas.validators.UserValidator;

@Controller
public class IdeaController {
	
	private IdeaServices ideaServices;
	private UserServices userServices;
	private UserValidator userValidator;
	
	public IdeaController(UserServices userServices, UserValidator userValidator, IdeaServices ideaServices) {
		this.userServices = userServices;
		this.userValidator = userValidator;
		this.ideaServices = ideaServices;
	}
	@RequestMapping("/ideas")
	public String homePage(HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("userId");
		if(userId == null) {
			return "redirect:/";
		}
		List<IdeaModel> ideaList = this.ideaServices.findAllIdeaModels(); 
		model.addAttribute("ideaList", ideaList);
		UserModel user = userServices.findUserModelById(userId);
		model.addAttribute("userModel", user);
		return "Dashboard.jsp";
	}
	
	@RequestMapping("/ideas/new")
	public String newBook(@ModelAttribute("ideaModel") IdeaModel ideaModel) {
		return "/CreateIdea.jsp";
	}
	
	@RequestMapping(value="/ideas/new", method=RequestMethod.POST)
	public String create (@Valid @ModelAttribute("ideaModel") IdeaModel ideaModel, BindingResult result, HttpSession session) {
		if(result.hasErrors()) {
			return "/CreateIdea.jsp";
		} else {
			Long userId = (Long) session.getAttribute("userId");
			ideaServices.CreateIdeaModel(ideaModel, userId);
			UserModel thisUser = this.userServices.findUserModelById(userId);
			IdeaModel thisIdea = this.ideaServices.CreateIdeaModel(ideaModel, userId);
			return "redirect:/ideas";
		}
	}
	
	@RequestMapping("/ideas/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		IdeaModel ideaModel = ideaServices.findIdeaModelById(id);
		model.addAttribute("ideaModel", ideaModel);
		return "/EditIdea.jsp";
	}
	
	@RequestMapping(value="/ideas/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("ideaModel") IdeaModel ideaModel, HttpSession session, BindingResult result) {
		if(result.hasErrors()) {
			return "/EditIdea.jsp";
		} else {
			Long userId = (Long) session.getAttribute("userId");
			IdeaModel thisIdea = ideaServices.UpdateIdeaModel(ideaModel, userId);
			return "redirect:/ideas";
		}
    }
	

	@RequestMapping(value="/ideas/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		ideaServices.deleteIdeaModel(id);
		return "redirect:/ideas";
	}

	
	@RequestMapping("/ideas/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		IdeaModel ideaModel = ideaServices.findIdeaModelById(id);
		model.addAttribute("idea", ideaModel);
		model.addAttribute("likedList", ideaModel.getUsersLiked());
		return "/ShowIdea.jsp";
	}
	
	@RequestMapping("/ideas/like/{id}")
	public String likeTheUser(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long)session.getAttribute("userId");

		if(userId == null) {
			return "redirect:/ideas";
		}
		
		UserModel thisUser = this.userServices.findUserModelById(userId);
		IdeaModel thisIdea = this.ideaServices.findIdeaModelById(id);
		this.ideaServices.likeUser(thisIdea, thisUser);
		return "redirect:/ideas";
	}
	
	@RequestMapping("/ideas/dislike/{id}")
	public String dislikeTheUser(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long)session.getAttribute("userId");

		if(userId == null) {
			return "redirect:/ideas";
		}
		UserModel thisUser = this.userServices.findUserModelById(userId);
		IdeaModel thisIdea = this.ideaServices.findIdeaModelById(id);
		this.ideaServices.dislikeUser(thisIdea, thisUser);
		return "redirect:/ideas";
	}
}
