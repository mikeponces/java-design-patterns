package com.pluralsight.designpatterns.behavioral.state.good;

public class Fan {

	final FanState fanOffState;
	final FanState fanLowState;
	final FanState fanMediumState;
	final FanState fanHighState;

	private FanState state;

	public Fan() {
		fanOffState = new FanOff(this);
		fanLowState = new FanLow(this);
		fanMediumState = new FanMedium(this);
		fanHighState = new FanHigh(this);

		state = fanOffState;
	}

	public FanState getFanOffState() {
		return fanOffState;
	}

	public FanState getFanLowState() {
		return fanLowState;
	}

	public FanState getFanMediumState() {
		return fanMediumState;
	}

	public FanState getFanHighState() {
		return fanHighState;
	}

	public void setState(FanState state) {
		this.state = state;
	}

	public void pullChain() {
		state.handleRequest();
	}

	@Override
	public String toString() {
		return state.toString();
	}
}
