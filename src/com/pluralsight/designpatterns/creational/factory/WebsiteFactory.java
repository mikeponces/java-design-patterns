package com.pluralsight.designpatterns.creational.factory;

public class WebsiteFactory {
	public static Website get(String siteType) {
		switch (siteType) {
		case "blog":
			return new Blog();
		case "shop":
			return new Shop();
		default:
			return null;
		}
	}
}
