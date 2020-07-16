package com.codingdojo.employeesandmanagers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.employeesandmanagers.models.UserModel;
import com.codingdojo.employeesandmanagers.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<UserModel> getAllUserModels() {
		return this.userRepository.findAll();
	}
	
	public UserModel getOneUserModel(Long id) {
		return this.userRepository.findById(id).orElse(null);
	}
	

	
}
