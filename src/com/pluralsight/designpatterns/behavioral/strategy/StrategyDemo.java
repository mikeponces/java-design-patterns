package com.pluralsight.designpatterns.behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		CreditCard amexCard = new CreditCard(new AmexStrategy());
		
		amexCard.setNumber("");
		amexCard.setDate("");
		amexCard.setCvv("");
		
		System.out.println("Is Amex card valid: "+amexCard.isValid());
		
		CreditCard amexCard2 = new CreditCard(new VisaStrategy());
		
		amexCard2.setNumber("");
		amexCard2.setDate("");
		amexCard2.setCvv("");
		
		System.out.println("Is Amex card valid: "+amexCard2.isValid());
	}
}
