package com.codingdojo.authone.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.authone.models.UserModel;
import com.codingdojo.authone.services.UserService;
import com.codingdojo.authone.validator.UserValidator;

@Controller
public class UserController {
	
	private UserService userService;
	
	private UserValidator userValidator;
	
	public UserController(UserService userService, UserValidator userValidator) {
		this.userService = userService;
		this.userValidator = userValidator;
	}
	
	@RequestMapping("/registration")
	public String registerPage(@Valid @ModelAttribute("userModel") UserModel userModel) {
		return "registrationPage.jsp";
	}
	
	@PostMapping("/registration")
	public String registerForm(@Valid @ModelAttribute("userModel") UserModel userModel, BindingResult result, Model model, HttpSession session) {
		userValidator.validate(userModel, result);
		if(result.hasErrors()) {
			return "registrationPage.jsp";
		}
//		userService.saveWithUserRole(userModel); // to create a user level
		userService.saveWithAdminRole(userModel); // to create a admin level
		return "redirect:/login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
		if(error!=null) {
			model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
		}
		if(logout!=null) {
			model.addAttribute("logoutMessage", "Logout Successful!");
		}
		return "loginPage.jsp";
	}
	
	@RequestMapping("/admin")
	public String adminPage(Principal principal, Model model) {
		String username = principal.getName();
		model.addAttribute("modelUser", userService.findByUsername(username));
		return "adminPage.jsp";
	}
	
    @RequestMapping(value = {"/", "/home"})
    public String home(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("userModel", userService.findByUsername(username));
        return "homePage.jsp";
    }
}
