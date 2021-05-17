package com.wipro.data;

import java.util.Set;

import com.wipro.entity.Employee;

public class EmployeeData {
	Set<Employee> employees;

	public EmployeeData(Set<Employee> employees) {
		super();
		this.employees = employees;
	}

	public void registerEmployee(Employee employee) {
		employees.add(employee);
	}

	public void printAllEmployees() {
		System.out.println("Employee List");
		System.out.println();
		System.out.format("%-15s %-15s %-15s %-30s %15s\n", "FirstName", "SecondName", "MobileNumber", "Email",
				"Address");
		for (Employee e : employees) {
			System.out.format("%-15s %-15s %-15s %-30s %15s\n", e.getFirstName(), e.getLastName(), e.getMobileNumber(),
					e.getEmail(), e.getAddress());
		}
	}
}
