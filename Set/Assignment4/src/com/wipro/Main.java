package com.wipro;

import java.util.Set;
import java.util.TreeSet;

import com.wipro.solution.Solution;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution(new TreeSet<String>());
		solution.saveCountry("India");
		solution.saveCountry("USA");
		solution.saveCountry("England");
		Set<String> allCountries = solution.saveCountry("China");
		System.out.println(allCountries);
		System.out.println(solution.getCountry("India"));
		System.out.println(solution.getCountry("Pakistan"));

	}

}
