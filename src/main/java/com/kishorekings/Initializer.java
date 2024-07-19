/*package com.kishorekings;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class Initializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
System.out.println("Added Successfully");

//XML based
//XmlWebApplicationContext con=new XmlWebApplicationContext();
//con.setConfigLocation("classpath:spring-config.xml");


// java based config
AnnotationConfigWebApplicationContext con=new AnnotationConfigWebApplicationContext();
con.register(Java_Config.class);
DispatcherServlet serv=new DispatcherServlet(con);
ServletRegistration.Dynamic srd=servletContext.addServlet("disp", serv);
srd.setLoadOnStartup(1);
srd.addMapping("/front/*");
	}

}*/
