package com.pluralsight.designpatterns.behavioral.visitor.good;

public interface AtvPart {

	void accept(AtvPartVisitor visitor);
}
