package com.codingdojo.authone.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codingdojo.authone.models.UserModel;
import com.codingdojo.authone.repositories.RoleRepository;
import com.codingdojo.authone.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public UserService(UserRepository userRepository,RoleRepository roleRepository,BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	public void saveWithUserRole(UserModel userModel) {
		userModel.setPassword(bCryptPasswordEncoder.encode(userModel.getPassword()));
		userModel.setRoleModels(roleRepository.findByName("ROLE_USER"));
		userRepository.save(userModel);
	}
	
	public void saveWithAdminRole(UserModel userModel) {
		userModel.setPassword(bCryptPasswordEncoder.encode(userModel.getPassword()));
		userModel.setRoleModels(roleRepository.findByName("ROLE_ADMIN"));
		userRepository.save(userModel);
	}
	
	public UserModel findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	
}
