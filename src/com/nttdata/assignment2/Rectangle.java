package com.nttdata.assignment2;

public class Rectangle {
	
	  int length;
	  int breadth;

	   Rectangle(int l, int b){
	    length = l;
	    breadth = b;
	  }

	  public void printArea(){
	    System.out.println(length*breadth);
	  }

	  public void printPerimeter(){
	    System.out.println(2*(length+breadth));
	  }
	}


