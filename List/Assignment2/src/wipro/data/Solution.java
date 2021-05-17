package wipro.data;

import java.util.Iterator;
import java.util.List;

import wipro.model.Employee;

public class Solution {
	List<Employee> allEmp;

	public Solution(List<Employee> allEmp) {
		super();
		this.allEmp = allEmp;
	}

	public void addEmp(int empId, String name, String email, String gender, float salary) {
		allEmp.add(new Employee(empId, name, email, gender, salary));
	}

	public void printAllEmployees() {
		Iterator<Employee> itr = allEmp.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
