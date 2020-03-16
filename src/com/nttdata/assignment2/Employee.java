package com.nttdata.assignment2;

import java.util.Scanner;

class Employee {
		public static void main (String[] args)
		{
			EmployeeDetails emp = new EmployeeDetails();
			
			/* taking input of employee details */
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("Enter salary");
			float salary = sc.nextFloat();
			System.out.println("Enter no. of hours of work");
			float hours = sc.nextFloat();
			
			/* calling methods of EmployeeDetail class */
			emp.getInfo(name, salary, hours);
			salary = emp.AddSal();
			salary = emp.AddWork();
			
			EmployeeSalary test = new EmployeeSalary(salary);  /* pass salary obtained from the methods of the EmployeeDetail class as parameter */
			test.printSal();  /* calling method of TestEmployee class to print final salary */
		}
	}
	