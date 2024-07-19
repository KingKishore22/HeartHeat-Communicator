package com.kishoreb.formater;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.kishoreb.pojo.Dto_Phone;

public class Phone_no_Formetter implements Formatter<Dto_Phone> {

	
		public Phone_no_Formetter() {
		System.out.println("Constructor Called successfully");
	}

	@Override
	public String print(Dto_Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dto_Phone parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		if(text.isBlank()) {
			System.out.println("Activated Successfuly");
		}
		else {
			System.out.println("De Activated Successfuly");
		}
		System.out.println("Formatter Loaded!!!!!!!!!");
		String par[]=text.split("-");
		Dto_Phone po=new Dto_Phone();
		po.setCode(par[0]);
		po.setNumber(par[1]);
		return po;
	}

}
