package com.pluralsight.designpatterns.behavioral.command;

// receiver
public class Light {

	private boolean isOn;

	public void toggle() {
		if(isOn) {
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}

	private void on() {
		System.out.println("Light switched on.");
	}

	private void off() {
		System.out.println("Light switched off.");
	}

	public boolean isOn() {
		return isOn;
	}
}
