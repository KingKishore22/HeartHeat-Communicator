package com.kishoreb.custompropertyediter;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import com.kishoreb.pojo.Card;

public class Custom_Card_Editor extends PropertiesEditor {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		System.out.println("Sets Method Invoked");
		String s1[]=text.split("-");
		Card ca=new Card();
		ca.setFir(s1[0]);
		ca.setSec(s1[1]);
		ca.setThi(s1[2]);
		ca.setFort(s1[3]);
		setValue(ca);
	
	}
	@Override
	public String getAsText() {
		System.out.println("Gets Method Invoked");
		// TODO Auto-generated method stub
		Card car=(Card)getValue();
		return "Like:"+car.getFir()+"-"+car.getSec()+"-"+car.getThi()+"-"+car.getFort();
	}
}
