            public class mobile {
	  
		String brand;
		String color;
		int storageInGb;
		int price;

		void chatting() {
			System.out.println("To chat");
		}

		void playing() {
			System.out.println("To play");
		}

		mobile() {
			brand = "Samsung";
			color = "White";
			storageInGb = 128;
			price = 19000;
		}

		mobile(String inbrand,String incolor,int instorageInGb,int inprice){
			brand = inbrand;
			color = incolor;
			storageInGb = instorageInGb;
			price = inprice;
}
}
