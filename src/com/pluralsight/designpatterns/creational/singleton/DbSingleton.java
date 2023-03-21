package com.pluralsight.designpatterns.creational.singleton;

public class DbSingleton {
	private volatile static DbSingleton instance; // thread safety

	private DbSingleton() {
		if (instance != null) { // avoid reflection calls
			throw new RuntimeException("Use getInstance() method to create");
		}
	}

	public static DbSingleton getInstance() {
		if (instance == null) {
			synchronized (DbSingleton.class) { // better synchronized performance vs. method
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
}
