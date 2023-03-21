package com.pluralsight.designpatterns.structural.composite;

public class Menu extends MenuComponent {
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public MenuComponent add(MenuComponent component) {
		menuComponents.add(component);
		return component;
	}

	@Override
	public MenuComponent remove(MenuComponent component) {
		menuComponents.remove(component);
		return component;
	}
}
