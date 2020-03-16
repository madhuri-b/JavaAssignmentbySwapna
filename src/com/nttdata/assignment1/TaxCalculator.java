package com.nttdata.assignment1;

import java.util.Scanner;

public class TaxCalculator {

	double annualIncome;
	double investedAmount;
	String sex;
	String panNumber;
	private double tax;
	
	public static void main(String[] args) {
		
		TaxCalculator taxCalculator= new TaxCalculator();
		taxCalculator.calculateTax();
		
	}
	
	public void calculateTax() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Annual Income  :");
		annualIncome=sc.nextDouble();
		System.out.println("Enter invested Amount :");
		investedAmount=sc.nextDouble();
		System.out.println("Invested amount is :"+investedAmount);
		
		double taxableAmount = (annualIncome - investedAmount);
		System.out.println("The taxable Amount is :" +taxableAmount);
		if ((taxableAmount>=0) && (taxableAmount<=2000)){
			tax=0.02;}
			else if ((taxableAmount>=2001) && (taxableAmount<=5000)){
				tax=60+0.04;}
			else if ((taxableAmount>=5001) && (taxableAmount<=10000)){
				tax=260+0.06;}
			else if ((taxableAmount>=10001) && (taxableAmount<=15000)){
				tax=560+0.08;}
			else if ((taxableAmount>=15001) && (taxableAmount<=20000)){
				tax=960+0.10;}
			else if ((taxableAmount>=20001) && (taxableAmount<=30000)){
				tax=1960+1.25;}
			else if ((taxableAmount>=30001) && (taxableAmount<=50000)){
				tax=4460+1.5;}
		System.out.println( "The Tax amount is  :" +tax);
		
			
		}
	}
	

