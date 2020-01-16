package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * This program calculates the average of a stream of non-negative numbers
 * 
 * @author Kevin Diaz
 *
 */
public class Average {
	/**
	 * By using the while loop users are able to input as many numbers as they want
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// initiating a 'yes'
		String answer = "y";
		do {
			// variables
			double count = 0;
			double sum = 0;
			double a;
			double avg = 0;

			System.out.printf("Enter a stream of non-negative numbers (negative when finished): ");

			// Loop that changes variable 'a'
			do {
				a = input.nextDouble();
				if (a > 0) {
					count++;
					sum = sum + a;
					avg = sum / count;
				} else if (a < 0) {
					break;
				}

			} while (a >= 0);

			System.out.printf("The average is: %.2f%n", avg);
			System.out.printf("Do you want to compute another average (y/n)? ");

			answer = input.next();

			// Ignore case to complete
		} while (answer.equalsIgnoreCase("y"));

	}

}
