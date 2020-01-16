package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * This program calculates the inflation of a price over time in years
 * 
 * @author Kevin Diaz
 *
 */
public class Inflation {
	/**
	 * User inputs the price, time(in years), and inflation rate, then the program
	 * outputs the price after inflation over the duration of time inputed
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// constant
		int i = 0;

		// input
		System.out.printf("Enter the current price of the item: $");
		double price = input.nextDouble();
		System.out.printf("Enter the number of years: ");
		int years = input.nextInt();
		System.out.printf("Enter the inflation rate as a percentage: ");
		double inflation = input.nextDouble();

		// errors
		if (years < 0) {
			System.out.printf("The number of years must be at least 0!%n");
			System.exit(0);
		}
		if (price < 0) {
			System.out.printf("The current price must be at least 0!%n");
			System.exit(0);
		}
		if (inflation < 0) {
			System.out.printf("The inflation rate must be at least 0!%n");
			System.exit(0);
		}

		// calculations
		inflation = inflation / 100;

		do {
			price = price * (1 + inflation);
			i = i + 1;
		} while (i < years);

		// output
		if (years == 1) {
			System.out.printf("After %d year, the price will be $%.2f%n", years, price);
		} else {
			System.out.printf("After %d years, the price will be $%.2f%n", years, price);
		}

	}

}
