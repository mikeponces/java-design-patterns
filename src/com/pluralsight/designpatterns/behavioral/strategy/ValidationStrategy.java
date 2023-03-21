package com.pluralsight.designpatterns.behavioral.strategy;

public abstract class ValidationStrategy {

	public abstract boolean isValid(CreditCard creditCard);
}
