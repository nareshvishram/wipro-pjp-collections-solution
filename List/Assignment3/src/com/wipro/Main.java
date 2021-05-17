package com.wipro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	private static List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		list.add("Snehal");
		list.add("Naresh");
		list.add("Manish");
		printAll();
	}

	private static void printAll() {
		Iterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
