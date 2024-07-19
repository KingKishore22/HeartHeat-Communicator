package com.kishoreb.convertor;

import org.springframework.core.convert.converter.Converter;

import com.kishoreb.pojo.Card;

public class Card_String implements Converter<Card, String>  {

	@Override
	public String convert(Card source) {
		// TODO Auto-generated method stub
		return source.getFir();
	}

}
