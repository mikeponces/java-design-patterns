package com.pluralsight.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		Employee employeeFromDb = new EmployeeDb();
		employees.add(employeeFromDb);

		EmployeeLdap employeeFromLdap = new EmployeeLdap();
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));

	}
}
