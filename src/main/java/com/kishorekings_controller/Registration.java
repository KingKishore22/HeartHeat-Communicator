package com.kishorekings_controller;

import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kishoreb.custompropertyediter.Custom_Card_Editor;
import com.kishoreb.custompropertyediter.Custom_Currency_Editor;
import com.kishoreb.custompropertyediter.Custom_My_Editor;
import com.kishoreb.formater.Phone_no_Formetter;
import com.kishoreb.pojo.Card;
import com.kishoreb.pojo.User_Bills;
import com.kishoreb.pojo.User_Dto_regis;
import com.kishoreb.validator.Custom_validator;

import jakarta.validation.Valid;

@Controller
public class Registration {	
@RequestMapping("/req")
public String getRegis(@ModelAttribute("objs") User_Dto_regis regis) {
	System.out.println("GetRegis1");
	return "register";
}

//hibernate validator
@RequestMapping("/req1")
public String getRegis12I(@Valid @ModelAttribute("objs")  User_Dto_regis regis1 , BindingResult res) {
	System.out.println("Get Regis2222222!!!");
		if(res.hasErrors()) {
		System.out.println("We have found 1 errors");
		return "register";
	}
	return "regis_det";
}
/*@RequestMapping("/req1")
public String getRegis1( @ModelAttribute("objs")  User_Dto_regis regis1 ) {
	
	return "regis_det";
}*/

@InitBinder
public void initbinder(WebDataBinder binder) {
	System.out.println("Init binder Added");
	binder.addValidators(new Custom_validator());
	/*
	 * Another way to declare or to create instance for Formatter Class 
	 * Previously we declared Formatter Class in Java config class
	 * binder.addCustomFormatter(new Phone_no_Formetter());*/	
}
}

