package com.kishoreb.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class Check_Age implements ConstraintValidator<AgeCheck, Integer> {

	private int mi;
	private int ma;
	
	@Override
	public void initialize(AgeCheck ch) {
		// TODO Auto-generated method stub
this.mi=ch.mini();
this.ma=ch.maxi();
	}
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(value.equals(null)) {
			return true; 
		}
		if(value>=mi && value<=ma) {
			return true;
		}
		return false;
	}

}
