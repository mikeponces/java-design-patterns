package com.pluralsight.designpatterns.behavioral.command;

import java.util.List;

// concrete command
public class AllLightsCommand implements Command {

	private List<Light> lights;

	public AllLightsCommand(List<Light> lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		lights.stream().filter(l -> l.isOn()).forEach(l -> l.toggle());
	}

}
