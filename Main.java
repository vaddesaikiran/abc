package com.example.shapeDetails;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
				System.out.println("choose a shape (Circle or Rectangle) :");
				String str = sc.next();
				if (str.equalsIgnoreCase("circle")){
					System.out.println("Enter the radius of a circle");
					double rad = sc.nextDouble();
					Circle cir = new Circle(rad);
					System.out.println("Shape: " +cir.getName());
					System.out.println("Area: " +cir.area());
					System.out.println("Perimeter: " + cir.perimeter());
					
				}
				else if (str.equalsIgnoreCase("rectangle")) {
					System.out.println("Enter the width of the rectangle");
					int width = sc.nextInt();
					System.out.println("Enter the height of the reactnagle");
					int height = sc.nextInt();
					Rectangle rec = new Rectangle(height, width);
					System.out.println("Shape: " + rec.getName());
					System.out.println("Area: " + rec.area());
					System.out.println("Perimeter: " +rec.perimeter());
				}
				else {
					System.out.println("Invalid option");
				}
		}
	}

}
