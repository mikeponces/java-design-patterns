package com.pluralsight.designpatterns.creational.abstractfactory;

public class Demo {
	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.get(649);
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card);

//		CreditCardFactory abstractFactory = CreditCardFactory.get(651);
//		CreditCard card = abstractFactory.getCreditCard(CardType.GOLD);
	}
}
