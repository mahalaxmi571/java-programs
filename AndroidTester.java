package com.xworkz.inheritance;

import com.xworkz.inheritance.AndroidKitKat.AndriodKitkat;

public class AndroidTester1 {


		public static void main(String[] args) {
			// inheritance
			AndriodKitkat  kitkat = new AndroidKitKat();
			// member from parent class
			kitkat.version = 10;
			kitkat.cameraPixel = 16;

			kitkat.displayDetails();
			kitkat.calling();
			kitkat.gaming();

			// member from child class
			kitkat.hasFaceLock = true;
			System.out.println("Has facelock: " + kitkat.hasFaceLock);
			kitkat.removeBoldClock();

			AndroidJellyBean jellyBean = new AndroidJellyBean();
			jellyBean.version = 4.0;
			jellyBean.cameraPixel = 10;
			jellyBean.displayDetails();
			jellyBean.calling();
			jellyBean.gaming();
		}
}
			// jellyBean.hasFaceLock // not possible because AndroidJellyBean is an independent
			// class

		

	

	//OUTPUT
	//Gaming
	//Has facelock: true
	//method remove bold clock font
	//Version: 4.0 Camera pixel: 10
	//calling
	//Gaming
