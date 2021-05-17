package main;

import java.util.HashMap;
import java.util.Map;

import wipro_hashmap_assignment.Solution;

public class Main {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Solution countryCapital = new Solution();
		countryCapital.saveCoutryCapital("India", "Delhi");
		countryCapital.saveCoutryCapital("Japan", "Tokyo");
		countryCapital.saveCoutryCapital("Pakistan", "Islamabad");
		countryCapital.saveCoutryCapital("England", "London");
		countryCapital.saveCoutryCapital("China", "Bejing");
		System.out.println(countryCapital.getCapital("India"));
		System.out.println(countryCapital.getCountry("Delhi"));
		System.out.println(countryCapital.getAllCountry());
		System.out.println(countryCapital.capitalCountry());

	}

}
