package com.pluralsight.designpatterns.behavioral.visitor.bad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

	private List<AtvPart> parts = new ArrayList<>();

	public void addPart(AtvPart part) {
		parts.add(part);
	}

	public List<AtvPart> getParts() {
		return Collections.unmodifiableList(parts);
	}

	@Override
	public double calculateShipping() {
		return parts.stream().mapToDouble(AtvPart::calculateShipping).sum();
	}

}
