package com.pluralsight.designpatterns.behavioral.mediator.colleague;

// concrete command
public class TurnOffAllLightsCommand implements Command {

	private Mediator mediator;

	public TurnOffAllLightsCommand(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOffAllLights();
	}

}
