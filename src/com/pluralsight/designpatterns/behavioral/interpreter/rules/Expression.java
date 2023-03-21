package com.pluralsight.designpatterns.behavioral.interpreter.rules;

public interface Expression {

	boolean interpret(String str);
}