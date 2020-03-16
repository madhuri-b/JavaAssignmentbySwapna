package com.nttdata.assignment1;

import java.util.Scanner;

public class Calculator {

	int num1;
	int num2;
public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.calcMethod();
}
	public void calcMethod() {
		float output;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number:");

		num1 = scanner.nextInt();
		System.out.print("Enter the second number:");
		num2 = scanner.nextInt();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);

		scanner.close();

		switch (operator) {
		case '+':
			output = num1 + num2;
			break;

		case '-':
			output = num1 - num2;
			break;

		case '*':
			output = num1 * num2;
			break;

		case '/':
			output = num1 / num2;
			break;

		default:
			System.out.printf("You have entered wrong operator");
			return;
		}

		System.out.println(num1 + " " + operator + " " + num2 + ": " + output);
	}
}
