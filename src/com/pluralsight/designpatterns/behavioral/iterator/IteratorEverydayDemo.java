package com.pluralsight.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Bryan");
		names.add("Aaron");

		Iterator<String> namesItr = names.iterator();
		while (namesItr.hasNext()) {
			String name = namesItr.next();
			System.out.println(name);
			namesItr.remove();
		}
		
		System.out.println(names.size());
	}
}
