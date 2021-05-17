package com.wipro.test;

import java.util.HashSet;

import com.wipro.data.Data;
import com.wipro.model.Employee;

public class Main {
	public static void main(String[] args) {
		Data data = new Data(new HashSet<Employee>());
		data.addEmployee(new Employee(100, "Snehal Saran", "angelpriya@gail.com", "Prefer not to say", 50000.00f));
		data.addEmployee(new Employee(101, "Nipun Gupta", "dr.ng@gail.com", "Male", 120000.00f));
		data.addEmployee(new Employee(101, "Naresh", "nareshkvishram@gail.com", "Male", 55000.00f));
		data.printAllEmployees();
	}
}
