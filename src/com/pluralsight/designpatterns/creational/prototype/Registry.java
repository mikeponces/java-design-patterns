package com.pluralsight.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<String, Item> items = new HashMap<>();

	public Registry() {
		loadItems();
	}

	public Item createItem(String type) {
		Item item = null;

		try {
			item = (Item)(items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return item;
	}

	public void loadItems() {
		Movie movie = new Movie();
		// set attributes
		items.put("Movie", movie);

		Book book = new Book();
		// set attributes
		items.put("Book", book);
	}
}
