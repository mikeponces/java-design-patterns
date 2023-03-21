package com.pluralsight.designpatterns.behavioral.chainofresponsibility.approver;

public class CEO extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEO's can approve anything they want.");
	}

}
