package com.pluralsight.designpatterns.behavioral.command;

// invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
