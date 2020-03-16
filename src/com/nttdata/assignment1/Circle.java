package com.nttdata.assignment1;

	import java.util.Scanner;

	public class Circle {

	 public static void main(String ag[]) {
	  int radius;
	  double pie = 3.14, area;
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter radius of circle:");
	  radius = s.nextInt();
	  area = pie * radius * radius;
	  System.out.println("Area of circle:" + area);
	  System.out.println("Perimeter is = " + (2 * radius * Math.PI));
	 }
	}