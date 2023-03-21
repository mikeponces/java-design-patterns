package com.pluralsight.designpatterns.behavioral.visitor.good;

public class Fender implements AtvPart {
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}

}
