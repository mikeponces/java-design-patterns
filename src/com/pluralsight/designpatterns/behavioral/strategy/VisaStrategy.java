package com.pluralsight.designpatterns.behavioral.strategy;

public class VisaStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return creditCard.getNumber().startsWith("4");
	}

}
