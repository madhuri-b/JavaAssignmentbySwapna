package com.nttdata.assignment1;

import java.util.Scanner;

public class Bank {
	
int accountNo = 23445553;
int balance = 1000;

static int newBalance;
Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	Bank depositeObj = new Bank();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Deposite Money :  ");
	int amountPay = sc.nextInt();
    depositeObj.deposit(amountPay);
	System.out.println("Amount is :  " +newBalance);
	
   int a = depositeObj.withdraw();
   System.out.println(a);}
	 
public int deposit(int amountPay)
{
	 newBalance=balance+amountPay;
    return(newBalance);
}
public int withdraw()
{
	System.out.println("Enter Withdraw Money :  ");
	int withdraw = sc.nextInt();
	int newbalance = newBalance-withdraw;	
	System.out.println("Amount after withdraw :" +newbalance);
	
	if (withdraw > newBalance) {
		return (-1);
	}
	return newbalance;
     }

}



