package com.pluralsight.designpatterns.behavioral.visitor.good;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

	double shippingAmount = 0;
	
	@Override
	public void visit(Wheel wheel) {
		shippingAmount += 1;
	}

	@Override
	public void visit(Fender fender) {
		shippingAmount += 2;		
	}

	@Override
	public void visit(Oil oil) {
		shippingAmount += 3;		
	}

	@Override
	public void visit(PartsOrder order) {
		if(order.getParts().size() > 3) {
			shippingAmount -= 1; // discount
		}
		System.out.println(shippingAmount);
	}
}
