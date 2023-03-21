package com.pluralsight.designpatterns.behavioral.state.good;

public class FanHigh extends FanState {

	public FanHigh(Fan fan) {
		super(fan);
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan off");
		fan.setState(fan.getFanOffState());
	}

	@Override
	public String toString() {
		return "Fan is on high";
	}

}
