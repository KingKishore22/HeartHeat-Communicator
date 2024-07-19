package com.kishoreb.convertor;

import org.springframework.core.convert.converter.Converter;

import com.kishoreb.pojo.Card;

public class Card_convertor implements Converter<String, Card> {

	@Override
	public Card convert(String source) {
		// TODO Auto-generated method stub
		String s1[]=source.split("-");
		Card ca=new Card();
		ca.setFir(s1[0]);
		ca.setSec(s1[1]);
		ca.setThi(s1[2]);
		ca.setFort(s1[3]);
	
		return ca;
	}

}
