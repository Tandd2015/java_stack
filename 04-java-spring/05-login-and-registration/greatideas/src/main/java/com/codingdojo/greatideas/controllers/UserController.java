package com.codingdojo.greatideas.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.greatideas.models.UserModel;
import com.codingdojo.greatideas.services.IdeaServices;
import com.codingdojo.greatideas.services.UserServices;
import com.codingdojo.greatideas.validators.UserValidator;

@Controller
public class UserController {
	
	private IdeaServices ideaServices;
	private UserServices userServices;
	private UserValidator userValidator;
	
	public UserController(UserServices userServices, UserValidator userValidator, IdeaServices ideaServices) {
		this.userServices = userServices;
		this.userValidator = userValidator;
		this.ideaServices = ideaServices;
	}
	
	@RequestMapping("/")
	public String registerFormPage(@ModelAttribute("userModel") UserModel userModel) {
		return "RegLog.jsp";
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String registerFormSubmit(@Valid @ModelAttribute("userModel") UserModel userModel, BindingResult result, HttpSession session) {
		// if result has errors, return the registration page (don't worry about validations just now)
		userValidator.validate(userModel, result);
		if(result.hasErrors()) {
			return "RegLog.jsp";
		} else {
		// else, save the user in the database, save the user id in session, and redirect them to the /home route
			UserModel user = userServices.registerUser(userModel);
			session.setAttribute("userId", user.getId());
			return "redirect:/ideas";
		}
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginFormSubmit(@RequestParam("emailaddress") String emailaddress, @RequestParam("password") String password, Model model, HttpSession session) {
		// if the user is authenticated, save their user id in session
		boolean isAuthenticated = userServices.authenticateUser(emailaddress, password);
		if(isAuthenticated) {
			UserModel userModel = userServices.findByEmailAddress(emailaddress);
			session.setAttribute("userId", userModel.getId());
			return "redirect:/ideas";
		} else {
		// else, add error messages and return the login page
			model.addAttribute("error", "Invalid Login Credentials. Please try again.");
			return "RegLog.jsp";
		}
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		// invalidate session
		session.invalidate();
		// redirect to login page
		return "redirect:/";
		
	}
}
