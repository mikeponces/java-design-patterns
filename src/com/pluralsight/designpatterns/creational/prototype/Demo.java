package com.pluralsight.designpatterns.creational.prototype;

public class Demo {
	public static void main(String[] args) {
		Registry registry = new Registry();
		
		Movie movie = (Movie) registry.createItem("Movie"); // did not call "new"
		
		movie.setTitle("Creational Patterns in Java");
	}
}
