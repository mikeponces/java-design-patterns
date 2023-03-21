package com.pluralsight.designpatterns.behavioral.interpreter.rules;

public class OrExpression implements Expression {

	private Expression exp1;
	private Expression exp2;

	public OrExpression(Expression exp1, Expression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public boolean interpret(String str) {
		return exp1.interpret(str) || exp2.interpret(str);
	}

}
