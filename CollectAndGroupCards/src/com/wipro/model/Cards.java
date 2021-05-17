package com.wipro.model;

public class Cards implements Comparable<Cards> {
	private char symbol;
	private int number;

	public Cards() {
	}

	public Cards(char symbol, int number) {
		super();
		this.symbol = symbol;
		this.number = number;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [symbol=" + symbol + ", number=" + number + "]";
	}

	@Override
	public int compareTo(Cards o) {
		if (this.symbol < o.symbol)
			return -1;
		else if (this.symbol > o.symbol)
			return 1;
		else
			return 1;
	}
}
