package com.pluralsight.designpatterns.behavioral.state.bad;

public class StateEverydayDemo {
	public static void main(String[] args) {
		Fan fan = new Fan();

		System.out.println(fan);

		fan.pullChain();

		System.out.println(fan);

		fan.pullChain();

		System.out.println(fan);
	}
}
