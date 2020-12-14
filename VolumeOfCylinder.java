package com.xworkz.memorymanagement;

public class VolumeOfCylinder {
	public static void main(String[] args) {

			//volume = 4/3*pi*r^2*h;
			System.out.println("Program to find volume of Cylinder");
			VolumeOfCylinder findvol = new VolumeOfCylinder();
			double result = findvol.findvolumeofcylinder(2,3);
			System.out.println("Volume :"+result);
			System.out.println("ENd of program");
		}
		double findvolumeofcylinder(int radius,int height) {
			double volume;
			double pi =findpi();
			volume = (4.00/3.00) * pi * radius*radius*height;
			return volume;

		}

		double findpi() {
			double pi = (22.00 / 7.00);
	 		return pi;
		}

		
	}