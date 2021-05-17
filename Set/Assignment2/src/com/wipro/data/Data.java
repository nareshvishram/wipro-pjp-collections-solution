package com.wipro.data;

import java.util.Set;

import com.wipro.model.Employee;

public class Data {
	Set<Employee> employees;

	public Data(Set<Employee> employees) {
		super();
		this.employees = employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void printAllEmployees() {
		for (Employee e : employees) {
			System.out.println(e);
		}
	}

}
