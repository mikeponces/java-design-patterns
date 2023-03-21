package com.pluralsight.designpatterns.behavioral.chainofresponsibility.approver;

public abstract class Handler {

	protected Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(Request request);
}
