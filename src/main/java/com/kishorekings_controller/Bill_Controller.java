package com.kishorekings_controller;

import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

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
import com.kishoreb.pojo.Card;
import com.kishoreb.pojo.User_Bills;
import com.kishoreb.validator.Custom_validator;

import jakarta.validation.Valid;

@Controller
public class Bill_Controller {
	@RequestMapping("/bill")
	public String readBill(@ModelAttribute("ob") User_Bills bil) {
	System.out.println("Bill controllerS");
	Card cx=new Card();
	cx.setFir("1111");
	cx.setSec("2222");
	cx.setThi("3333");
	cx.setFort("4444");
	bil.setCard(cx);

	System.out.println("Bill controllerS setted");
		return "bill";
		
	}

	@RequestMapping("/bill1")
	public String getBill(@Valid @ModelAttribute("ob") User_Bills bil,BindingResult res) {
		System.out.println("Bill1 final controllerS1");
		if(res.hasErrors()) {
			System.out.println("We have found 1 errors");
			return "bill";
		}
		return "bill_res";
	}
	@InitBinder
	public void initbinder(WebDataBinder binder) {
		System.out.println("Init binder Added");
		SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor edi=new CustomDateEditor(sim, true);
		Custom_My_Editor editor=new Custom_My_Editor();
		Custom_Currency_Editor curr=new Custom_Currency_Editor();
		Custom_Card_Editor car=new Custom_Card_Editor();
		binder.registerCustomEditor(Currency.class,"currency",curr);
		binder.registerCustomEditor(Date.class,"date",edi);
		binder.registerCustomEditor(String.class,"name", editor);
		binder.registerCustomEditor(Card.class,"card",car);
		/*
		 * Another way to declare or to create instance for Formatter Class 
		 * Previously we declared Formatter Class in Java config class
		 * binder.addCustomFormatter(new Phone_no_Formetter());*/	
	}

}
