package main;

import java.util.HashMap;

import wipro_hashmap_assignment.Solution;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Snehal", "Smart");
		map.put("Sanju", "Honest");
		map.put("Sikar", "Beautiful");
		map.put("Status", "All Izz Well");
		Solution solution = new Solution(map);
		System.out.println(solution.isKeyExist("Snehal"));
		System.out.println(solution.isKeyExist("Naresh"));
		System.out.println(solution.isValueExist("Smart"));
		solution.iterate();

	}

}
