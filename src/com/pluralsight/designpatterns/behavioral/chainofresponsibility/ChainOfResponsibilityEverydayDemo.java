package com.pluralsight.designpatterns.behavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityEverydayDemo {

	private static final Logger logger = Logger.getLogger(ChainOfResponsibilityEverydayDemo.class.getName());

	public static void main(String[] args) {
		logger.setLevel(Level.FINER);

		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINER);
		logger.addHandler(handler);

		logger.finest("finest"); // wont print
		logger.finer("finer"); // prints
		logger.fine("fine"); // prints
	}
}
