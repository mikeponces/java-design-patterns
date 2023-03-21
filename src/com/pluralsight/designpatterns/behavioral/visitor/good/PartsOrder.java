package com.pluralsight.designpatterns.behavioral.visitor.good;

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
	public void accept(AtvPartVisitor visitor) {
		parts.stream().forEach(p -> p.accept(visitor));
		visitor.visit(this);
	}

}
