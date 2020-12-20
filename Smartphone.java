Package com.xworkz.block
public class Smartphone {
	String brand;
	double price;
	int sizeininches;

	{
		System.out.println("Initialization block 1");
		brand = "Samsung";
	}

	Smartphone() {
		System.out.println("No Arg constructor");
	}

	{
		System.out.println("Initialization block 2");
		price = 30000.00;
	}

	Smartphone(String inbrand, double inprice, int insizeininches) {
		brand = inbrand;
		price = inprice;
		sizeininches = insizeininches;
	}

	{
		System.out.println("Initialization block 3");
		sizeininches = 40;
	}

}