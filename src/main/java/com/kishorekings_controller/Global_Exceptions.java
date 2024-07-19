package com.kishorekings_controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Global_Exceptions {
	@ExceptionHandler(value = Exception.class)
	public String handelException() {
		return "exceptions";
	}
}
