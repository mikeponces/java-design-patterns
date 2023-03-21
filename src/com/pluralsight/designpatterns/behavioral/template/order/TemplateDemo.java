package com.pluralsight.designpatterns.behavioral.template.order;

public class TemplateDemo {
	public static void main(String[] args) {
		OrderTemplate webOrder = new WebOrder();
		webOrder.processOrder();
		
		OrderTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
	}
}
