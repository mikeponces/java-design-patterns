package com.pluralsight.designpatterns.creational.builder;

public class LunchOrder {

	// final attributes
	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;

	// only a builder can create the object
	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}

	public static class Builder { // static because outer class has private constructor
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;

		public Builder() {

		}

		public LunchOrder build() {
			return new LunchOrder(this);
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}

}
