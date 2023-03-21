package com.pluralsight.designpatterns.behavioral.state.good;

public class FanOff extends FanState {

	public FanOff(Fan fan) {
		super(fan);
	}

	@Override
	public void handleRequest() {
		System.out.println("Turn fan on to low");
		fan.setState(fan.getFanLowState());
	}

	@Override
	public String toString() {
		return "Fan is off";
	}
}
