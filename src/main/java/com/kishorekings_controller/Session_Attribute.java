package com.kishorekings_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.kishoreb.pojo.UuserDTO;

@Controller
@SessionAttributes("modd")
public class Session_Attribute {
	
@RequestMapping("/sess")
public String sess2() {
	
	return "session";
}
	
	
@RequestMapping("/sub")
public String sess(UuserDTO dtos,Model mod) {
	mod.addAttribute("modd",dtos);
	return "session1";
}
@RequestMapping("/sess1")
public String sess1(Model mo,SessionStatus sta ) {
	//sta.setComplete(); ===>to delete session Attribuutes
	return "session2";
}

}
