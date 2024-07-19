package com.kishoreb.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.kishoreb.pojo.User_Dto_regis;

public class Custom_validator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		System.out.println("Custom validator supports method!!!");
		return User_Dto_regis.class.equals(clazz);
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		System.out.println("Custom  Validator method!!!");
		String na=((User_Dto_regis)(target)).getL_name();
		if(na.contains("*")) {
			errors.rejectValue("l_name","code","Error_Got");
		}
	}

}
