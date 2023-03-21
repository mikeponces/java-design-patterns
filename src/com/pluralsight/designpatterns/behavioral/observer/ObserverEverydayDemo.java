package com.pluralsight.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {
	public static void main(String[] args) {
		TwitterStream messageStream = new TwitterStream();
		
		Client client1 = new Client("Bryan");
		Client client2 = new Client("Enzo");
		
		messageStream.addObserver(client1);
		messageStream.addObserver(client2);
		
		messageStream.someoneTweeted();
	}
}

@SuppressWarnings("deprecation")
class TwitterStream extends Observable {
	public void someoneTweeted() {
		setChanged();
		notifyObservers();
	}
}

class Client implements Observer {

	private String name;

	public Client(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Update "+name+"'s stream, someone is tweeting.");
	}
	
}
