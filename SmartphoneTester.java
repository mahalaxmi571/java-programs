package com.xworkz.block;

public class SmartphoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Smartphone lg = new Smrartphone();
       System.out.println("Brand : "+lg.brand);
       System.out.println("Price : "+lg.price);
       System.out.println("Size in Inches : "+lg.sizeininches);
       System.out.println("----------------------------------------------------");
       Smartphone mi = new Smartphone("MI",35000.00,50);
       System.out.println("Brand : "+mi.brand);
       System.out.println("Price : "+mi.price);
       System.out.println("Size in Inches : "+mi.sizeininches);
      
	}

}