package com.codingdojo.greatideas.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.codingdojo.greatideas.models.UserModel;
import com.codingdojo.greatideas.repositories.UserRepository;

@Service
public class UserServices {

	private final UserRepository userRepository;
	
	public UserServices (UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	// register user and hash their password
	public UserModel registerUser(UserModel userModel) {
		String hashed = BCrypt.hashpw(userModel.getPassword(), BCrypt.gensalt());
		userModel.setPassword(hashed);
		return userRepository.save(userModel);
    }

	// find user by EmailAddress
	public UserModel findByEmailAddress(String emailaddress) {
		return userRepository.findByEmailAddress(emailaddress);
    }

	// find user by id
	public UserModel findUserModelById(Long id) {
		
		Optional<UserModel> userModel = userRepository.findById(id);
		
		if(userModel.isPresent()) {
			return userModel.get();
		} else {
			return null;
		}
	}
	// authenticate user
	public boolean authenticateUser(String emailaddress, String password) {
		// first find the user by email
		UserModel userModel = userRepository.findByEmailAddress(emailaddress);
		// if the passwords match, return false
		
		if(userModel == null) {
			return false;
		} else {
			//if the passwords match, return true, else, return false
			if(BCrypt.checkpw(password, userModel.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}
}
