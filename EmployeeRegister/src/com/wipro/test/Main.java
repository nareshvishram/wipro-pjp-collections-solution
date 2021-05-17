package com.wipro.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.wipro.data.EmployeeData;
import com.wipro.entity.Employee;

public class Main {
	public static void main(String[] args) {

		userInput();

	}

	private static void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees");
		int n = sc.nextInt();
		EmployeeData data = starter();
		while (n-- > 0) {
			System.out.println("Enter employee " + (n + 1) + " 's detail");
			System.out.println("Enter First Name");
			String fName = sc.next().trim();

			System.out.println("Enter Last Name");
			String lName = sc.next().trim();

			System.out.println("Enter Mobile Number ");
			String mNumber = sc.next().trim();

			System.out.println("Enter Email ");
			String email = sc.next().trim();

			System.out.println("Enter Address ");
			String address = sc.next().trim();

			data.registerEmployee(new Employee(fName, lName, mNumber, email, address));
		}
		data.printAllEmployees();
		sc.close();

	}

	private static EmployeeData starter() {
		Set<Employee> set = new TreeSet<>(new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getFirstName().compareTo(e2.getFirstName());
			};
		});
		EmployeeData emData = new EmployeeData(set);
		return emData;
	}
}
