package com.nttdata.assignment2;


  class Shape {       //superclass or parent class	or base class	
	 
	public void print() {
		
		System.out.println("This is shape");
	}
	}
	 class Rectangle1 extends Shape {            //sub class or child class or derived class
		
		public void print() {
			super.print();
			System.out.println("This is Rectanangle shape");
			
		}

	}
	 class Circle extends Shape {
		
		public void print() {
			
			System.out.println("This is circle shape");
			
		}	 }
		
		class Square1 extends Rectangle1{
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				super.print();
				
				System.out.println("sqaure is a rectangle");
			}
			
			
	
			
			}
	

