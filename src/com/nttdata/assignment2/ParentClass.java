package com.nttdata.assignment2;

public class ParentClass {

	
		  public void parentmethod(){
			    System.out.println("This is parent class");	

		  }
			  public static void main(String[] args){
			    ParentClass p = new ParentClass();
			    Childclass c = new Childclass();
			    p.parentmethod();
			    c.childmethod();
			    c.parentmethod();
			  }
								
	}
	

