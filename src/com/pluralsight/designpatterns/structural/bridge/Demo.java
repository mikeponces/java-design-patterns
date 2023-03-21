package com.pluralsight.designpatterns.structural.bridge;

public class Demo {
	public static void main(String[] args) {
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter();

		String printedMaterial = moviePrinter.print(printFormatter);

		System.out.println(printedMaterial);

		Formatter htmlFormatter = new HtmlFormatter();

		String htmlMaterial = moviePrinter.print(htmlFormatter);

		System.out.println(htmlMaterial);
	}
}
