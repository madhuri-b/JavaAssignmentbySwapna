package com.nttdata.assignment1;

import java.util.Scanner;

public class Electronics {
	
	int regularPrice;
	private String manufacturer;
	
	public static void main(String[] args) {
		Electronics electronics= new Electronics();
		electronics.computerSalePrice();
//		electronics.setManufacturer("Toyota");
//		String manu=electronics.getManufacturer();
//		System.out.println();
		
	}
	public void computerSalePrice() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Regular price :"  );
		regularPrice = sc.nextInt();
		//System.out.println("Enter Manufacturer price :");
		//manufacturerPrice =sc.nextInt();
		
		double salePrice = (regularPrice*0.6);
		System.out.println("Sale Price is :"+salePrice);
		
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	

}
