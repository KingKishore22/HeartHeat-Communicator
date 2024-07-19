package com.kishorekings_controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kishoreb.dao.Dao_imp;
import com.kishoreb.pojo.UuserDTO;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class Home_pages {
	@RequestMapping("/")
	public String details(@ModelAttribute("mods") UuserDTO dto) {
		return "homepg";
	}
	
	@RequestMapping("/click1")
	public String details1(@RequestParam String yourname,@RequestParam String crushname)
 {
		System.out.println("Name:"+yourname);
		System.out.println("Crush Name:"+crushname);
		
		return "next";
	}
	
	@RequestMapping("/click2")
	public String details3(@Valid UuserDTO dto,Model mod,BindingResult re)
 {
		System.out.println("Binding Name:"+dto.getYourname());
		System.out.println("Binding Crush Name:"+dto.getCrushname());
		
		System.out.println(re.hasErrors());
		mod.addAttribute("use",dto);
		if(re.hasErrors()) {
			System.out.println("Yes we have found one error");
			return "homepg";
		}
		return "next";
	}
	@RequestMapping("/click")
	public String details2(@Valid @ModelAttribute("mods") UuserDTO dto,BindingResult re,HttpServletResponse res,HttpServletRequest req)
 {
		System.out.println("Binding Name:"+dto.getYourname());
		System.out.println("Binding Crush Name:"+dto.getCrushname());
	
		System.out.println(re.hasErrors());
	
		if(re.hasErrors()) {
			System.out.println("Yes we have found one error");
			return "homepg";
		}
		//Cookie cook=new Cookie("my_name", dto.getYourname());
		//cook.setMaxAge(60860*24);
		//res.addCookie(cook);
		//Session
		
	     HttpSession sess=req.getSession();
	     
		
		 String name1 = dto.getYourname().toLowerCase().replaceAll("\\s", "");
	        
         String name2 = dto.getCrushname().toLowerCase().replaceAll("\\s", "");
	        
	     String flamesResult = calculateFlamesResult(name1, name2);
	     
		Dao_imp imps=new Dao_imp();
		List<UuserDTO>use=new ArrayList<>();
		use.add(dto);
	dto.setAddList(use);	
		dto.setRelation(flamesResult);
		 sess.setAttribute("Names",dto.getYourname());
		 sess.setAttribute("Crush", dto.getCrushname());
		 sess.setAttribute("relation", dto.getRelation());
		 sess.setMaxInactiveInterval(120);
	
		 for(UuserDTO us:use) {
			 System.out.println(us.getYourname());
			 System.out.println(us.getCrushname());
			 System.out.println(us.getRelation());
			 
		 }
		 System.out.println(use);
		 
		return "next";
	}
	

	
	
	
	
	
	
	
	
	
	public static String calculateFlamesResult(String name1, String name2) {
        StringBuilder flames = new StringBuilder("flames");
        int totalLetters = name1.length() + name2.length();
        
        for (int i = 0; i < name1.length(); i++) {
            char currentLetter = name1.charAt(i);
            int index = flames.indexOf(Character.toString(currentLetter));
            
            if (index != -1) {
                flames.deleteCharAt(index);
            }
        }
        
        for (int i = 0; i < name2.length(); i++) {
            char currentLetter = name2.charAt(i);
            int index = flames.indexOf(Character.toString(currentLetter));
            
            if (index != -1) {
                flames.deleteCharAt(index);
            }
        }
        
        int remainingLetters = flames.length();
        
        String result = "";
        
        switch (remainingLetters) {
            case 1:
                result = "Friends";
                break;
            case 2:
                result = "Lovers";
                break;
            case 3:
                result = "Angry";
                break;
            case 4:
                result = "Married";
                break;
            case 5:
                result = "Engaged";
                break;
            case 6:
                result = "Siblings";
                break;
            default:
                result = "No relationship";
                break;
        }
        
        return result;
    }
	
	
	
	
	
	
	
}

