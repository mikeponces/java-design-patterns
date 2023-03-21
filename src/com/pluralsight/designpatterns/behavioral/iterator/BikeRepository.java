package com.pluralsight.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

	private String[] bikes = new String[10];
	private int index = 0;

	public void addBike(String bike) {
		if (index == bikes.length) {
			throw new IllegalArgumentException("No more bikes can be added.");
		}
		bikes[index++] = bike;
	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < bikes.length && bikes[currentIndex] != null;
			}

			@Override
			public String next() {
				return bikes[currentIndex++];
			}

		};
	}
}
