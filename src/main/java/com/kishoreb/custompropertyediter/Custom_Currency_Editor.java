package com.kishoreb.custompropertyediter;

import java.util.Currency;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class Custom_Currency_Editor extends PropertiesEditor {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		String s=text.toUpperCase();
		Currency con=Currency.getInstance(s);
		setValue(con);
	}
}
