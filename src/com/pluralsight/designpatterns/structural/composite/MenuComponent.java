package com.pluralsight.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<>();

	public MenuComponent add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent remove(MenuComponent component) {
		throw new UnsupportedOperationException();
	}
}
