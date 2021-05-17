package com.wipro;

import java.util.List;

public class Solution {
	List<String> months;

	public Solution(List<String> months) {
		this.months = months;
	}

	public void addMonths(String name) {
		name = name.trim();
		if (name == null || name.length() == 0)
			return;
		months.add(name);
	}

	public void print() {
		for (String m : months) {
			System.out.println(m);
		}
	}
}