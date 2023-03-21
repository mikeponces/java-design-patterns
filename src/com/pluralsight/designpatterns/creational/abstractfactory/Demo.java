package com.pluralsight.designpatterns.creational.abstractfactory;

public class Demo {
	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.get(649);
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

//		CreditCardFactory abstractFactory = CreditCardFactory.get(651);
//		CreditCard card = abstractFactory.getCreditCard(CardType.GOLD);
	}
}
