package com.wipro.model;

public class Box {
	Double length;
	Double width;
	Double height;

	public Box(Double length, Double width, Double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public Double getLength() {
		return length;
	}

	public Double getWidth() {
		return width;
	}

	public Double getHeight() {
		return height;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double volume() {
		return length * width * height;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}

}
