package com.pluralsight.designpatterns.behavioral.state.good;

public class FanLow extends FanState {

	public FanLow(Fan fan) {
		super(fan);
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan to medium");
		fan.setState(fan.getFanMediumState());
	}

	@Override
	public String toString() {
		return "Fan is on low";
	}

}
