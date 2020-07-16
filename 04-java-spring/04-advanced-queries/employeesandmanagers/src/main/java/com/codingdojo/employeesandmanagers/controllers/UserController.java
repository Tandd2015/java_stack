package com.codingdojo.employeesandmanagers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.employeesandmanagers.models.UserModel;
import com.codingdojo.employeesandmanagers.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/")
	public List<UserModel> pathAllUserModels() {
		List<UserModel> userModels = this.userService.getAllUserModels();
		return userModels;
	}

	@GetMapping("/{id}")
	public UserModel pathOneUserModel(@PathVariable("id") Long id) {
		UserModel userModel =this.userService.getOneUserModel(id);
		return userModel;
		
	}
	

	@GetMapping("/m/{id}")
	public List<UserModel> pathManagerEmpolyees(@PathVariable("id") Long id) {
		List<UserModel> userModels = this.userService.getAllUserModels();
		return this.userService.getOneUserModel(id).getEmployees();
	}
	
	@GetMapping("/e/{id}")
	public UserModel pathEmployeesManager(@PathVariable("id") Long id) {
		List<UserModel> userModels = this.userService.getAllUserModels();
		return this.userService.getOneUserModel(id).getManager();
	}
}
