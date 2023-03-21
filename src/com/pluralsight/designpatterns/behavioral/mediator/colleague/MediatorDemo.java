package com.pluralsight.designpatterns.behavioral.mediator.colleague;

public class MediatorDemo {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();

		Light bedroomLight = new Light("Bedroom");
		Light kitchenLight = new Light("Kitchen");

		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);

		Command turnOnAllLights = new TurnOnAllLightsCommand(mediator);
		turnOnAllLights.execute();
		
		Command turnOffAllLights = new TurnOffAllLightsCommand(mediator);
		turnOffAllLights.execute();
	}
}
