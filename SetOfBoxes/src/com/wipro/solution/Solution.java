package com.wipro.solution;

import java.util.Set;

import com.wipro.model.Box;

public class Solution {
	Set<Box> boxes;

	public Solution(Set<Box> boxes) {
		super();
		this.boxes = boxes;
	}

	public void insertBox(Box box) {
		boxes.add(box);
	}

	public void printAll() {
		System.out.println("Unique Boxes in the Set");
		StringBuffer sBuffer = new StringBuffer();
		for (Box b : boxes) {
			sBuffer.append("Length = " + b.getLength() + " ");
			sBuffer.append("Width = " + b.getWidth() + " ");
			sBuffer.append("Height = " + b.getHeight() + " ");
			sBuffer.append("Volume = " + String.format("%.2f", b.volume()));
			sBuffer.append("\n");
		}
		System.out.println(sBuffer.toString());

	}

}
