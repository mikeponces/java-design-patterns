package com.pluralsight.designpatterns.behavioral.interpreter.rules;

public class InterpreterDemo {

	static Expression buildInterpreterTree() {
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");

		return new AndExpression(terminal1, terminal2);
	}

	public static void main(String[] args) {
		String context = "Tigers Lions";

		Expression define = buildInterpreterTree();

		System.out.println(context + " is " + define.interpret(context));
	}
}
