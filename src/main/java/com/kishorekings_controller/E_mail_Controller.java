package com.kishorekings_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.support.SessionStatus;

import com.kishoreb.pojo.Mail_pojo;
import com.kishoreb.pojo.UuserDTO;
import com.kishoreb.services.Java_Mail_Interface;
import com.kishoreb.services.Java_Mail_send;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class E_mail_Controller {
	
	@Autowired
	Java_Mail_send sendd;
	//using cookies
	/*@RequestMapping("/mail")
	public String gets(@CookieValue("my_name") String my_name, Model model, HttpServletRequest req) {
		/*Cookie[]cook=req.getCookies();
		for(Cookie coo:cook) {
			if(coo.getName().equals("my_name")) {
				model.addAttribute("My_Name", coo.getValue());
			}
		}*/
	/*	model.addAttribute("My_Name",my_name);
		
		return "mail_view";
	}
*/	
	@RequestMapping("/mail")
	public String gets(Model model, HttpServletRequest req) {
		/*Cookie[]cook=req.getCookies();
		for(Cookie coo:cook) {
			if(coo.getName().equals("my_name")) {
				model.addAttribute("My_Name", coo.getValue());
			}
		}*/
		HttpSession ses=req.getSession();
		String my_name=(String) ses.getAttribute("Names");
		model.addAttribute("My_Name",my_name);
	sendd.checkmails();
		return "mail_view";
	}

	//using Cookies
	/*@RequestMapping("/mail1")
	public String gets1(@CookieValue("my_name") String my_name,@RequestParam("name") String name,Model model) {
		model.addAttribute("My_Name",my_name);
		model.addAttribute("email", name);
		return "Mail_rec";
	}*/
	
	
	
	@RequestMapping("/mail1")
	public String gets1(@RequestParam("name") String name,Model model,HttpServletRequest req) {
		HttpSession ses=req.getSession();
		String my_na=(String) ses.getAttribute("Names");
		String cr_name=(String) ses.getAttribute("Crush");
		String rel=(String) ses.getAttribute("relation");
		model.addAttribute("My_Name",my_na);
		model.addAttribute("email", name);
		sendd.sendMail(name,my_na,cr_name,rel);
		return "Mail_rec";
	}
	
	@RequestMapping("/demo")
	public String gets12(@SessionAttribute("modd") UuserDTO dto, Model model,SessionStatus sta) {
		
		
		System.out.println("Name:"+dto.getYourname());
		System.out.println("Crush Name:"+dto.getCrushname());
		
		return "demos";
	}
	
	
	  @RequestMapping("/send/{username}")
	    public String gets12(@PathVariable("username") String username, Model mo) {
	        mo.addAttribute("vars", new Mail_pojo());
	        mo.addAttribute("vals", username);
	        return "Mail_send";
	    }
	  
}
