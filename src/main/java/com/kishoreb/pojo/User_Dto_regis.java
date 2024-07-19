package com.kishoreb.pojo;

import org.springframework.beans.factory.annotation.Value;

import com.kishoreb.annotations.AgeCheck;

import jakarta.validation.constraints.NotBlank;

public class User_Dto_regis {
	
@NotBlank(message = "${lname.error}")
String f_name;
String l_name;
String place;
String country;
String hob[];
@AgeCheck(mini = 18,maxi = 50, message = "Not Eligible plez!!!!!!!!")
Integer age;

public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
Dto_Communication com;

public Dto_Communication getCom() {
	return com;
}
public void setCom(Dto_Communication com) {
	this.com = com;
}
public String[] getHob() {
	return hob;
}
public void setHob(String[] hob) {
	this.hob = hob;
}
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
}
public String getL_name() {
	return l_name;
}
public void setL_name(String l_name) {
	this.l_name = l_name;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}


}
