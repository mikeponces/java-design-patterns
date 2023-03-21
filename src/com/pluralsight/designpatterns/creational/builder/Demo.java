package com.pluralsight.designpatterns.creational.builder;

public class Demo {
	public void getterSetter() {
		LunchOrderBeanGetterSetter bean = new LunchOrderBeanGetterSetter();
		bean.setBread("Wheat");
		bean.setCondiments("Lettuce");
		bean.setDressing("Mustard");
		bean.setMeat("Ham");
	}

	public void telescoping() {
		LunchOrderBeanTelescoping lunchOrder = new LunchOrderBeanTelescoping("Wheat", "Lettuce");
		
		System.out.println(lunchOrder);
	}

	public void builder() {
		LunchOrder.Builder lunchOrderBuilder = new LunchOrder.Builder();
		lunchOrderBuilder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");

		LunchOrder lunchOrder = lunchOrderBuilder.build();
		
		System.out.println(lunchOrder);
	}
}
