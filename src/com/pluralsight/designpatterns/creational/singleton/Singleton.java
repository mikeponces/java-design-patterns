package com.pluralsight.designpatterns.creational.singleton;

public class Singleton {
	private static Singleton singleton;

	private Singleton() {
	} // no one else can create an instance

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton(); // lazy-loading
		}
		return singleton;
	}
}