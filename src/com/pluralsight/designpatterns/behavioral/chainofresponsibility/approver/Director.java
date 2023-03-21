package com.pluralsight.designpatterns.behavioral.chainofresponsibility.approver;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(RequestType.CONFERENCE.equals(request.getRequestType())) {
			System.out.println("Directors can approve conferences");
		} else {
			successor.handleRequest(request);
		}
	}

}
