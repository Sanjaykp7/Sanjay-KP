package com.screening;

import java.util.Scanner;

public class Problem1 {


	public static double calculate(double a, double b, String operation) {
		switch (operation.toLowerCase()) {
		case "add":
			return a + b;
		case "subtract":
			return a - b;
		case "multiply":
			return a * b;
		case "divide":
			if (b == 0) {
				System.out.println("Cannot divide by zero!");
				return 0;
			}
			return a / b;
		default:
			System.out.println("Invalid operation!");
			return 0;
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		double a = sc.nextDouble();

		System.out.print("Enter b: ");
		double b = sc.nextDouble();

		System.out.print("Enter your operation (add/subtract/multiply/divide): ");
		String op = sc.next();

		double result = calculate(a, b, op);

		System.out.println("Result: " + result);
	}
}

