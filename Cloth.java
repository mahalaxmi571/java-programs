package com.xworkz.staticmember.fields;

public class Cloth {

	String brand;
	double cost;
	static String color = "blue";
	{ // initialization block
		System.out.println("varity of cloth");
	}

	Cloth(String inbrand, double incost, String incolor) { // constructor
		brand = inbrand;
		cost = incost;
		color = incolor;

	}

	static void setcolor(String color) { // static method
		color = "grey";
	}

	void displayDetails() {

		System.out.println("brand:" + brand + "  " + "cost:" + cost + "  " + "color:" + color);
	}

}
