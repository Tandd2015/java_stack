package com.codingdojo.authone.validator;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.codingdojo.authone.models.UserModel;

@Component
public class UserValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return UserModel.class.equals(clazz);
	}
	
	@Override
	public void validate(Object object, Errors errors) {
		UserModel userModel = (UserModel) object;
		if(!userModel.getPasswordConfirmation().equals(userModel.getPassword())) {
			errors.rejectValue("passwordConfirmation", "Match");
		}
	}
}
