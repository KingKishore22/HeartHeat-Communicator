package com.kishorekings_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kishoreb.pojo.UuserDTO;

@Controller
public class Conreoller_Adv1 {

	@RequestMapping("/cr1")
	public String getCR(@ModelAttribute("msd") UuserDTO dt)
	{
		System.out.println("Cr1 Name"+dt.getYourname());
		System.out.println("Cr1 Crush Name"+dt.getCrushname());
		return "cr1";
	}
}
