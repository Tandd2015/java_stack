package com.codingdojo.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.authentication.models.UserModel;
import com.codingdojo.authentication.services.UserService;
import com.codingdojo.authentication.validators.UserValidator;

@Controller
public class UserController {
	
	private UserService userService;
	private UserValidator userValidator;
	
	public UserController(UserService userService, UserValidator userValidator) {
		this.userService = userService;
		this.userValidator = userValidator;
	}
	
	@RequestMapping("/registration")
	public String registerFormPage(@ModelAttribute("userModel") UserModel userModel) {
		return "registrationPage.jsp";
	}
	
	@RequestMapping("/login")
	public String loginFormPage() {
		return "loginPage.jsp";
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String registerFormSubmit(@Valid @ModelAttribute("userModel") UserModel userModel, BindingResult result, HttpSession session) {
		// if result has errors, return the registration page (don't worry about validations just now)
		userValidator.validate(userModel, result);
		if(result.hasErrors()) {
			return "registrationPage.jsp";
		} else {
		// else, save the user in the database, save the user id in session, and redirect them to the /home route
			UserModel user = userService.registerUser(userModel);
			session.setAttribute("userId", user.getId());
			return "redirect:/home";
		}
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginFormSubmit(@RequestParam("emailaddress") String emailaddress, @RequestParam("password") String password, Model model, HttpSession session) {
		// if the user is authenticated, save their user id in session
		boolean isAuthenticated = userService.authenticateUser(emailaddress, password);
		if(isAuthenticated) {
			UserModel userModel = userService.findByEmailAddress(emailaddress);
			session.setAttribute("userId", userModel.getId());
			return "redirect:/home";
		} else {
		// else, add error messages and return the login page
			model.addAttribute("error", "Invalid Login Credentials. Please try again.");
			return "loginPage.jsp";
		}
		
	}
	
	@RequestMapping("/home")
	public String homePage(HttpSession session, Model model) {
		// get user from session, save them in the model and return the home page
		Long userId = (Long) session.getAttribute("userId");
		UserModel user = userService.findUserModelById(userId);
		model.addAttribute("userModel", user);
		return "homePage.jsp";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		// invalidate session
		session.invalidate();
		// redirect to login page
		return "redirect:/login";
		
	}
}
