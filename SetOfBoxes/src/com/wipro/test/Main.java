package com.wipro.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.wipro.model.Box;
import com.wipro.solution.Solution;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution solution = new Solution(new TreeSet<Box>(new Comparator<Box>() {
			public int compare(Box o1, Box o2) {
				return (int) (o1.volume() - o2.volume());
			};
		}));
		System.out.println("Enter the number of Box ");
		int n = sc.nextInt();
		while (n-- > 0) {
			System.out.println("Enter the Box " + n + "'s details");
			System.out.println("Enter  Length");
			Double l = sc.nextDouble();
			System.out.println("Enter  Width");
			Double w = sc.nextDouble();
			System.out.println("Enter  Height");
			Double h = sc.nextDouble();
			solution.insertBox(new Box(l, w, h));

		}
		solution.printAll();
		sc.close();
	}
}
