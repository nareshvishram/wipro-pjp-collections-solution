package com.wipro.solution;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		System.out.println(isExist("Naresh", set));
		set.add("Snehal");
		set.add("Nipun");
		set.add("Karan");
		set.add("Naresh");
		set.add("Arun");
		printAll(set);
		printAll(reverseData(set));
		System.out.println(isExist("Naresh", set));

	}

	private static Set<String> reverseData(Set<String> set) {

		Set<String> revSet = new TreeSet<>(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			};
		});
		for (String s : set)
			revSet.add(s);
		return revSet;
	}

	private static void printAll(Set<String> set) {
		for (String s : set)
			System.out.print(s + " ");
		System.out.println();
	}

	private static boolean isExist(String name, Set<String> set) {
		return set.contains(name.trim());

	}

}
