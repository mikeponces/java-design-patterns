package com.pluralsight.designpatterns.behavioral.memento;

// originator
public class Employee {

	private String name;
	private String address;
	private String phone;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeMemento save() {
		return new EmployeeMemento(name, phone);
	}

	public void revert(EmployeeMemento emp) {
		this.name = emp.getName();
		this.phone = emp.getPhone();
	}

	@Override
	public String toString() {
		return new StringBuilder(name).append(" ").append(address).append(" ").append(phone).toString();
	}
}
