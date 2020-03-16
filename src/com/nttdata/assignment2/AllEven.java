package com.nttdata.assignment2;

import java.util.Scanner;

public class AllEven {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		AllEven alleven = new AllEven();
		AllEven.even();
		// System.out.println(check);

	}

	public static void even() {

		int size, i;

		System.out.println("Enter the number of elements in an array :");
		size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("please Enter " + size + " " + "Elements of an Array :");

		for (i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		int j = 0;
		for (i = 0; i < size; i++) {
			if (a[i] % 2 == 0) {
				j = 0;
			}

			else {
				j = 1;
break ;
			}
		}
		if (j == 0) {
			
			System.out.println("true");
			
		} else {
			System.out.println("false");

		}

	}

}
