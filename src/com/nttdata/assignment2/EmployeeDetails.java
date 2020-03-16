package com.nttdata.assignment2;

public class EmployeeDetails {
	
		private String name;
		private float salary, hours;
		
		public EmployeeDetails() {
			name = " ";
			salary = 0;
			hours = 0;
		}
		
		public void getInfo(String n, float sal, float hr) {
			name = n;
			salary = sal;
			hours = hr;
		}
		
		public float AddSal() {
			if(salary<500) {
				salary = salary + 10;
			}
			return salary;
		}
		
		public float AddWork() {
			if(hours > 6) {
				salary = salary + 5;
			}
			return salary;
		}
	}

