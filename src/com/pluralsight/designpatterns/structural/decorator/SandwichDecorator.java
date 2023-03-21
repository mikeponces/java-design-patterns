package com.pluralsight.designpatterns.structural.decorator;

public abstract class SandwichDecorator implements Sandwich {

	protected Sandwich customSandwich; // instance that gets decorated

	public SandwichDecorator(Sandwich customSandwich) {
		this.customSandwich = customSandwich;
	}

	@Override
	public String make() {
		return customSandwich.make();
	}

}
