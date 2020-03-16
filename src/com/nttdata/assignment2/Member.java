package com.nttdata.assignment2;


	public class Member{
		  String name;
		  int age;
		  String phoneNo;
		  String address;
		  int salary;
		private String specialization;
		  public static void main(String[] args) {

			    Member e = new Member();
			    e.name = "xyz";
			    e.age = 23;
			    e.phoneNo = "986****";
			    e.address = "xyzxyz";
			    e.salary = 30000;
	           // Employee f = new Employee();
			    e.specialization = "Developer";
			    e.printSalary();
	}
		  
			  public void printSalary(){
				    System.out.println(salary);
			
		}
		
		  
		  class Employee extends Member{
			  String specialization;

		}
		  class Manager extends Member{
			  String department;
			}


	}


