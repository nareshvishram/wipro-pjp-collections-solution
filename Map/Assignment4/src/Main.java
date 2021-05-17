import java.util.HashMap;
import java.util.Map;

import wipro.Solution;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		Solution s = new Solution(map);
		s.saveDetails("Snehal", 332001);
		s.saveDetails("Sanju", 332406);
		s.saveDetails("Naresh", 462003);
		System.out.println(s.isKeyExist("Naresh"));
		System.out.println(s.isValueExist(24006));
		System.out.println(s.isValueExist(332406));
		s.iterate();
	}
}
