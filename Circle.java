package com.example.shapeDetails;

public class Circle implements shape {
	
	private static final double pi = Math.PI;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	
	@Override
	public double area() {
		return pi * Math.pow(radius,2);
		
	}

	@Override
	public double perimeter() {
		return 2 * pi * radius;
	}

	@Override
	public String getName() {
		return "Circle";
	}

}
