import java.util.ArrayList;

import wipro.data.Solution;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution(new ArrayList<>());
		solution.addEmp(100, "Snaju", "sanjusaran_1998@gmail.com", "Prefer not to say", 48000);
		solution.addEmp(101, "Manish", "manish@gmail.com", "M", 100000);
		solution.addEmp(102, "Naresh", "nn@gmail.com", "M", 1.1f);
		solution.addEmp(103, "Joshita", "js@gmail.com", "F", 99.45f);
		solution.printAllEmployees();

	}
}
