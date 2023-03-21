package com.pluralsight.designpatterns.behavioral.state.good;

public abstract class FanState {

	protected Fan fan;

	public FanState(Fan fan) {
		this.fan = fan;
	}

	public void handleRequest() {
		System.out.println("Invalid state");
	}
}
