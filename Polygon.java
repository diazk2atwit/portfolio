package edu.wit.cs.comp1000;

import java.util.Scanner;

public class Polygon {
	/**
	 * This computes the area, perimeter, and interior angle of a regular polygon.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// variables
		double s;
		double n;
		double area;
		double perimeter;
		double interiorAngle;

		// inputs
		System.out.printf("Enter number of sides: ");
		n = input.nextDouble();
		System.out.printf("Enter side length: ");
		s = input.nextDouble();

		if (s <= 0) {
			System.out.printf("Side length must be positive.%n");
			System.exit(0);
		}
		if (n < 3) {
			System.out.printf("A polygon must have at least 3 sides.%n");
			System.exit(0);
		}
		// calculations
		area = ((s * s) * n) / (4 * Math.tan(Math.PI / n));
		perimeter = n * s;
		interiorAngle = 180 - (360 / n);

		// outputs
		System.out.printf("Area: %.3f%n", area);
		System.out.printf("Perimeter: %.3f%n", perimeter);
		System.out.printf("Interior Angle: %.3f degrees%n", interiorAngle);

	}
}
