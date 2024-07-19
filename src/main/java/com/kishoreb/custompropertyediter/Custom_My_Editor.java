package com.kishoreb.custompropertyediter;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class Custom_My_Editor extends PropertiesEditor {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		String s=text.toUpperCase();
		setValue(s);
	}
}
