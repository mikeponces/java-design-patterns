package com.pluralsight.designpatterns.behavioral.memento;

public class MementoDemo {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		
		Employee emp = new Employee();
		emp.setName("John Wick");
		emp.setAddress("111 Main Street");
		emp.setPhone("12345");
		
		System.out.println(emp);
		
		caretaker.save(emp);
		
		emp.setName("Ian McCall"); // haven't called saved
		
		System.out.println(emp);
		
		caretaker.revert(emp);
		
		System.out.println(emp);
	}

}
