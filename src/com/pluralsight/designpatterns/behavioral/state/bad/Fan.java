package com.pluralsight.designpatterns.behavioral.state.bad;

public class Fan {
	final static int OFF = 0;
	final static int LOW = 1;
	final static int MEDIUM = 2;
	int state = OFF;

	public void pullChain() {
		if (state == OFF) {
			System.out.println("Turning Fan on to low");
			state = LOW;
		}  else if (state == LOW) {
			System.out.println("Turning Fan to medium");
			state = MEDIUM;
		} else if (state == MEDIUM) {
			System.out.println("Turning Fan to off");
			state = OFF;
		}
	}

	public String toString() {
		if (state == OFF) {
			return "Fan is off";
		} else if (state == LOW) {
			return "Fan is on low";
		}else if (state == MEDIUM) {
			return "Fan is on medium";
		}

		return "Invalid State";
	}
}
