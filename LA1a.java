package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * This program computes the sum, mean, and population standard deviation of a
 * list of 5 numbers
 * 
 * @author kjd
 *
 */
public class LA1a {

	/**
	 * This program computes the sum, mean, and population standard deviation from
	 * the user's input of 5 numbers
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// inputs
		System.out.printf("Enter five numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();

		// calculations
		double sum = (a + b + c + d + e);
		double mean = (sum / 5);

		double d1 = (mean - a);
		double d2 = (mean - b);
		double d3 = (mean - c);
		double d4 = (mean - d);
		double d5 = (mean - e);

		double s1 = (d1 * d1) + (d2 * d2) + (d3 * d3) + (d4 * d4) + (d5 * d5);
		double s2 = (s1 / 5);

		double StandardD = Math.sqrt(s2);

		// outputs
		System.out.printf("Sum: %.2f%n", sum);
		System.out.printf("Mean: %.2f%n", mean);
		System.out.printf("Population Standard Deviation: %.2f%n", StandardD);
	}

}
