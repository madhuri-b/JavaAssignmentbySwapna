package com.nttdata.assignment1;

import java.util.Scanner;

public class Student {

	String studentName;

	int rollNo, ec1Marks, ec2Marks, ec3Marks;
	float total, avg;

	public static void main(String[] args) {

		Student stuObj = new Student();
		stuObj.stuOutput();

		System.out.println("Total Marks is  :" + stuObj.total);
		System.out.println("Average Marks  :" + stuObj.avg);
		String result = stuObj.stuResult();
		System.out.println(result);
	}

	public void stuOutput() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ec1Marks");
		ec1Marks = sc.nextInt();

		System.out.println("Enter ec2Marks");
		ec2Marks = sc.nextInt();

		System.out.println("Enter ec3Marks");
		ec3Marks = sc.nextInt();

		total = ec1Marks + ec2Marks + ec3Marks;
		avg = total / 3;

	}

	public String stuResult() {

		if (total >= 50) {

			return "Pass";

		} else {

			return "Fail";

		}

	}
}
