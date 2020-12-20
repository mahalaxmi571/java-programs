package com.xworkz.staticmember.fields;


	public class ClothTester {

		public static void main(String[] args) {
			Cloth cotton = new Cloth("Peterengland", 2000.0,"blue");
			cotton.displayDetails(); // calling object
			Cloth.setcolor("grey");//static method
                       Cloth jeans=new Cloth("Max",3000.0,"black");
                       jeans.displayDetails();
                       Cloth.setcolor("ash");
		}

	}

