package com.codingdojo.authentication.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.codingdojo.authentication.models.UserModel;
import com.codingdojo.authentication.repositories.UserModelRepository;

@Service
public class UserService {
	
	private final UserModelRepository userModelRepository;
	
	public UserService (UserModelRepository userModelRepository) {
		this.userModelRepository = userModelRepository;
	}
	
	// register user and hash their password
	public UserModel registerUser(UserModel userModel) {
		String hashed = BCrypt.hashpw(userModel.getPassword(), BCrypt.gensalt());
		userModel.setPassword(hashed);
		return userModelRepository.save(userModel);
    }

	// find user by EmailAddress
	public UserModel findByEmailAddress(String emailaddress) {
		return userModelRepository.findByEmailAddress(emailaddress);
    }

	// find user by id
	public UserModel findUserModelById(Long id) {
		
		Optional<UserModel> userModel = userModelRepository.findById(id);
		
		if(userModel.isPresent()) {
			return userModel.get();
		} else {
			return null;
		}
	}
	// authenticate user
	public boolean authenticateUser(String emailaddress, String password) {
		// first find the user by email
		UserModel userModel = userModelRepository.findByEmailAddress(emailaddress);
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
