package com.pluralsight.designpatterns.behavioral.mediator.colleague;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

	private List<Light> lights = new ArrayList<>();

	public void registerLight(Light light) {
		lights.add(light);
	}

	public void turnOnAllLights() {
		lights.stream().filter(l -> !l.isOn()).forEach(Light::toggle);
	}

	public void turnOffAllLights() {
		lights.stream().filter(Light::isOn).forEach(Light::toggle);	
	}
}
