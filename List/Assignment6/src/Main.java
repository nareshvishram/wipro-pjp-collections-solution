import java.util.Vector;

import com.wipro.Solution;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution(new Vector<>());
		s.addMonths("January");
		s.addMonths("February");
		s.addMonths("March");
		s.addMonths("April");
		s.addMonths("May");
		s.addMonths("June");
		s.addMonths("July");
		s.addMonths("August");
		s.addMonths("September");
		s.addMonths("October");
		s.addMonths("November");
		s.addMonths("December");
		s.print();

	}

}
