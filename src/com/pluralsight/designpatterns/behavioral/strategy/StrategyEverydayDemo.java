package com.pluralsight.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
	public static void main(String[] args) {
		List<People> people = new ArrayList<>();
		Collections.sort(people, new Comparator<People>() {
			@Override
			public int compare(People o1, People o2) {
				if (o1.getAge() > o2.getAge()) {
					return 1;
				}

				if (o1.getAge() < o2.getAge()) {
					return -1;
				}

				return 0;
			}
		});

		Collections.sort(people, new Comparator<People>() {
			@Override
			public int compare(People o1, People o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}
}
