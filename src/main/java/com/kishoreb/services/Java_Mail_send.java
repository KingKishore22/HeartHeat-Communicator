package com.kishoreb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class Java_Mail_send implements Java_Mail_Interface{
	
	@Autowired
	JavaMailSenderImpl impl;

	@Override
	public void sendMail(String mail,String na,String cr,String re) {
		// TODO Auto-generated method stub
		SimpleMailMessage mes=new SimpleMailMessage();
		mes.setTo(mail);
		mes.setSubject("FLAMES Result");
		mes.setText(na+" and "+cr+" are "+re);
		impl.send(mes);
	}
	public void checkmails() {
		System.out.println("Mail Added Successfully");
	}
	

}
