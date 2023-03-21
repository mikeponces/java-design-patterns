package com.pluralsight.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
	public static void main(String[] args) {
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();
		Switch lightSwitch = new Switch();

		// client uses Command and not Light.on/off
		Command toggleCommand = new ToggleCommand(bedroomLight);

		lightSwitch.storeAndExecute(toggleCommand);

		List<Light> lights = new ArrayList<>();
		lights.add(bedroomLight);
		lights.add(kitchenLight);

		Command allLightsCommand = new AllLightsCommand(lights);

		lightSwitch.storeAndExecute(allLightsCommand);
	}
}
