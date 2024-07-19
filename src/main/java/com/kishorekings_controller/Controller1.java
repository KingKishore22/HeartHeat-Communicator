package com.kishorekings_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller1 {
	
	
	
	@RequestMapping("/c")
	public String mains() {
		return "viewres";
	}

}
