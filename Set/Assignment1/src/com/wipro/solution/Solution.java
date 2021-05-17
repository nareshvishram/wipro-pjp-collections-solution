package com.wipro.solution;

import java.util.Set;

public class Solution {
	Set<String> country;

	public Solution(Set<String> set) {
		this.country = set;
	}

	public Set<String> saveCountry(String countryName) {
		country.add(countryName.trim());
		return country;
	}

	public String getCountry(String countryName) {
		if (country.contains(countryName.trim()))
			return countryName;
		return null;
	}

}
