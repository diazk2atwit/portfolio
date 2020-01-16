package edu.wit.cs.comp1050;

import java.util.Scanner;

/**
 * This program takes the sum and figures out how many coins can fit within it
 * 
 * @author Kevin Diaz
 *
 */
public class PA1c {
	/**
	 * Takes total value and figures of how many quarter, dimes, nickels, and
	 * pennies can equal the same value
	 */
	/**
	 * Error message to display for negative amount
	 */
	public static final String ERR_MSG = "Dollar amount must be non-negative!";

	/**
	 * Method to convert a double to an integer
	 * 
	 * @param num number to convert
	 * @return converted value
	 */
	public static int convertToInt(double num) {
		return (int) Math.round(num);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int q = 0;
		int d = 0;
		int n = 0;
		int p = 0;

		// input
		System.out.print("Enter total amount: $");
		double sum = input.nextDouble();

		convertToInt(sum);

		sum = sum * 100;

		// quarter
		q = (int) (sum / 25);
		if (q > 0) {
			sum = sum % 25;
		}

		// dime
		d = (int) (sum / 10);
		if (d > 0) {
			sum = sum % 10;
		}

		// nickel
		n = (int) (sum / 5);
		if (n > 0) {
			sum = sum % 5;
		}

		// penny
		p = (int) Math.round(sum);
		;

		// error
		if (q < 0 || d < 0 || n < 0 || p < 0) {
			System.out.println(ERR_MSG);
			System.exit(0);
		}

		// print
		if (q == 1) {
			System.out.printf("You have %d quarter, ", q);
		} else {
			System.out.printf("You have %d quarters, ", q);
		}

		if (d == 1) {
			System.out.printf("%d dime, ", d);
		} else {
			System.out.printf("%d dimes, ", d);
		}

		if (n == 1) {
			System.out.printf("%d nickel, ", n);
		} else {
			System.out.printf("%d nickels, ", n);
		}

		if (p == 1) {
			System.out.printf("and %d penny.%n", p);
		} else {
			System.out.printf("and %d pennies.%n", p);
		}

	}

}
