package com.pluralsight.designpatterns.behavioral.mediator;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Timer timer = new Timer();

	public static void main(String[] args) {
		new MediatorEverydayDemo().schedule(1);
	}

	private void schedule(int seconds) {
		timer.schedule(new RemindTask(), seconds * 1000);
		timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
	}

	class RemindTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("time's up!");
			toolkit.beep();
		}
	}

	class RemindTaskWithoutBeep extends TimerTask {

		@Override
		public void run() {
			System.out.println("Now time's really up!");
			timer.cancel();
		}
	}
}
