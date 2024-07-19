package com.kishoreb.pojo;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class User_Bills {
	
	    @NotNull
		Currency currency;
	
	Card card;
	
	@NotNull
	String amount;
	
        @NotNull	
		Date date;
	    
        @NotNull
		String name;

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
