package com.pluralsight.designpatterns.structural.adapter;

public class EmployeeAdapterLdap implements Employee {
	private EmployeeLdap instance;

	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}

	public EmployeeLdap getInstance() {
		return instance;
	}
}
