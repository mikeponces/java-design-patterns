package com.pluralsight.designpatterns.behavioral.state.good;


public class Demo {
	public static void main(String[] args) {
		Fan fan = new Fan();

		System.out.println(fan);

		fan.pullChain();

		System.out.println(fan);

		fan.pullChain();

		System.out.println(fan);
		
		fan.pullChain();

		System.out.println(fan);
		
		fan.pullChain();

		System.out.println(fan);
		
		fan.pullChain();

		System.out.println(fan);
		
		fan.pullChain();

		System.out.println(fan);
	}
}
