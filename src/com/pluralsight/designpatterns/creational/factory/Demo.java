package com.pluralsight.designpatterns.creational.factory;

public class Demo {
	public static void main(String[] args) {
		Website blog = WebsiteFactory.get("blog");
		Website shop = WebsiteFactory.get("shop");
		
		System.out.println(blog);
		System.out.println(shop);
	}
}
