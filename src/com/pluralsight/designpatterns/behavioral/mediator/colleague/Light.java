package com.pluralsight.designpatterns.behavioral.mediator.colleague;

// receiver
public class Light {

	private boolean isOn;
	private String room;

	public Light(String room) {
		this.room = room;
	}

	public void toggle() {
		if (isOn) {
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}

	private void on() {
		System.out.println(room + " Light switched on.");
	}

	private void off() {
		System.out.println(room + " Light switched off.");
	}

	public boolean isOn() {
		return isOn;
	}
}
