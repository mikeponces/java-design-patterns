package com.pluralsight.designpatterns.creational.abstractfactory;

public abstract class CreditCardFactory {
	public static CreditCardFactory get(int creditScore) {
		if(creditScore > 650) {
//			return new AmexFactory();
			return null;
		} else {
			return new VisaFactory();
		}
	}

	public abstract CreditCard getCreditCard(CardType cardType);

	public abstract Validator getValidator(CardType cardType);
}
