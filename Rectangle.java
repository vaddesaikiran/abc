package com.example.shapeDetails;

public class Rectangle implements shape {
	
	private int height;
	private int width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double perimeter() {
		return 2 * (width + height);
	}

	@Override
	public String getName() {
		return "Rectangle";
	}

}
