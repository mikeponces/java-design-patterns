package com.pluralsight.designpatterns.structural.flyweight;

public class Order {

	private final int orderNumber;
	private final Item item;

	Order(int orderNumber, Item item) {
		this.orderNumber = orderNumber;
		this.item = item;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public Item getItem() {
		return item;
	}
}
