package com.wipro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.wipro.model.Cards;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, ArrayList<Cards>> map = new TreeMap<>();

		System.out.println("Enter Number of Cards :");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter card " + n);
			char symbol = sc.nextLine().charAt(0);
			int number = sc.nextInt();

			Cards cards = new Cards();
			cards.setSymbol(symbol);
			cards.setNumber(number);
			sc.nextLine();

			if (!map.containsKey(symbol)) {
				ArrayList<Cards> list = new ArrayList<>();
				list.add(cards);
				map.put(symbol, list);
			} else {
				ArrayList<Cards> list = map.get(symbol);
				list.add(cards);
			}
		}
		System.out.println("Distinct Symbols are :");

		Set<Entry<Character, ArrayList<Cards>>> set = map.entrySet();
		Iterator<Entry<Character, ArrayList<Cards>>> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next().getKey() + " ");
		}
		System.out.println();

		set = map.entrySet();
		it = set.iterator();

		while (it.hasNext()) {
			int sum = 0;
			Map.Entry<Character, ArrayList<Cards>> me = it.next();
			ArrayList<Cards> list = me.getValue();

			System.out.println("Cards in " + me.getKey() + " Symbol");

			for (Cards card : list) {
				System.out.println(card.getSymbol() + " " + card.getNumber());
				sum += card.getNumber();
			}

			System.out.println("Number of cards : " + list.size());
			System.out.println("Sum of Numbers : " + sum);
		}

		sc.close();
	}

}
