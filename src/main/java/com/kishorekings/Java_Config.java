package com.kishorekings;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.format.FormatterRegistry;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.kishoreb.convertor.Card_String;
import com.kishoreb.convertor.Card_convertor;
import com.kishoreb.formater.Phone_no_Formetter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.kishorekings_controller","com.kishoreb.services"})
@PropertySource("classpath:messgae.properties")
public class Java_Config implements WebMvcConfigurer  {
	

@Bean
InternalResourceViewResolver viewres() {
	InternalResourceViewResolver res=new InternalResourceViewResolver();
	System.out.println("Internal view resolver");
	res.setPrefix("/WEB-INF/view/");
	res.setSuffix(".jsp");
	return res;
}


@Bean
JavaMailSenderImpl configSendMail() {
	JavaMailSenderImpl mail=new JavaMailSenderImpl();
	    mail.setHost("smtp.gmail.com");
	    mail.setUsername("kishorekishore3377@gmail.com");
	    mail.setPassword("osdb fvxo owco iycb"); // Use an App Password if 2-Step Verification is enabled
	    mail.setPort(587);
	    
	    Properties pro = new Properties();
	    pro.put("mail.smtp.host", "smtp.gmail.com");
	    pro.put("mail.smtp.port", "587");
	    pro.put("mail.smtp.auth", "true");
	    pro.put("mail.smtp.ssl.protocols", "TLSv1.2");
	    pro.put("mail.smtp.starttls.enable", "true");
	    
	    pro.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mail.setJavaMailProperties(pro);
        return mail;
	
}


@Bean
DriverManagerDataSource source1() {
	DriverManagerDataSource da=new DriverManagerDataSource();
	da.setUrl("jdbc:mysql://localhost:3306/history?characterEncoding=utf8");
	da.setUsername("root");
	da.setPassword("kishore");
	
	return da;
}
@Bean
JdbcTemplate temp() {
	JdbcTemplate tem=new JdbcTemplate();
	tem.setDataSource(source1());
	return tem;
}


@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub
	System.out.println("Config formed!!!");
	registry.addFormatter(new Phone_no_Formetter());
	//registry.addConverter(new Card_convertor());
	//registry.addConverter(new Card_String());
	}

}
