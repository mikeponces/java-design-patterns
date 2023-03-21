package com.pluralsight.designpatterns.structural.decorator;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich customSandwich) {
		super(customSandwich);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String make() {
		return customSandwich.make() + addDressing();
	}

	private String addDressing() {
		return "mustard";
	}

}
