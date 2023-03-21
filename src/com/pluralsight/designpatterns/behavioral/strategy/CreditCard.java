package com.pluralsight.designpatterns.behavioral.strategy;

public class CreditCard {

	private String number;
	private String date;
	private String cvv;
	private ValidationStrategy validationStrategy;

	public CreditCard(ValidationStrategy validationStrategy) {
		this.validationStrategy = validationStrategy;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public boolean isValid() {
		return validationStrategy.isValid(this);
	}
}
