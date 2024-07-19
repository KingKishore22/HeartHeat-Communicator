package com.kishorekings_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kishoreb.pojo.Dto_Phone;
import com.kishoreb.pojo.UuserDTO;

@Controller
@ControllerAdvice
public class Controller_Advice {

	Dto_Phone phone;
	@ModelAttribute("msd")
	public UuserDTO dto() {
		System.out.println("Activated!!!!!!!!!!");
		UuserDTO dt=new UuserDTO();
		dt.setYourname("Kishore");
		dt.setCrushname("Aysha");
		return dt;
	}
	
	@RequestMapping("/cr")
	public String getCR(@ModelAttribute("msd") UuserDTO dt)
	{
		System.out.println(phone.getNumber());
		
		System.out.println("Cr Name"+dt.getYourname());
		System.out.println("Cr Crush Name"+dt.getCrushname());
	
		return "cr";
	}
	
	
}
