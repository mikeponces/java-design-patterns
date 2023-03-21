package com.pluralsight.designpatterns.creational.builder;

public class LunchOrderBeanTelescoping {
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;

	public LunchOrderBeanTelescoping(String bread) {
		this.bread = bread;
	}

	public LunchOrderBeanTelescoping(String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}
	// more constructors

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public void setDressing(String dressing) {
		this.dressing = dressing;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}
}
