package com.pluralsight.designpatterns.behavioral.state.good;

public class FanMedium extends FanState {

	public FanMedium(Fan fan) {
		super(fan);
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan to high");
		fan.setState(fan.getFanHighState());
	}

	@Override
	public String toString() {
		return "Fan is on medium";
	}

}
