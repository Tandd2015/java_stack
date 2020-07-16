package com.codingdojo.greatideas.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.codingdojo.greatideas.models.UserModel;
import com.codingdojo.greatideas.repositories.UserRepository;

@Component
public class UserValidator implements Validator {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return UserModel.class.equals(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		UserModel userModel = (UserModel)target;
		
		if(!userModel.getPasswordConfirmation().equals(userModel.getPassword())) {
			errors.rejectValue("passwordConfirmation", "Match");
		}
		
	}


}
