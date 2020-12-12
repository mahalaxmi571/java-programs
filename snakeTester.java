
public class snakeTester {
public static void main(String[] args) {
		
		snake cobra = new snake();
		cobra.breed = "cobra";
		cobra.color = "black";
		cobra.isPoisonous = true;
		cobra.lifeSpan = 50;
		cobra.lengthInMeters = 1;
		System.out.println("details of cobra");
		System.out.println("color of cobra: " +cobra.color);
		System.out.println("breed of cobra: " +cobra.breed);
		System.out.println("isPoisonous of cobra:" +cobra.isPoisonous);
		System.out.println("lifespan of cobra:" +cobra.lifeSpan);
		System.out.println("length of the cobra:" +cobra.lengthInMeters );
	
		snake rattleSnake = new snake();
		rattleSnake.breed = "rattle";
		rattleSnake.color = "dusty";
		rattleSnake.isPoisonous = true;
		rattleSnake.lifeSpan = 25;
		rattleSnake.lengthInMeters = 1;
		System.out.println("details of rattleSnake");
		System.out.println("color of rattleSnake:" +rattleSnake.color);
		System.out.println("breed of rattleSnake: " +rattleSnake.breed);
		System.out.println("isPoisonous of rattleSnake:" +rattleSnake.isPoisonous);
		System.out.println("lifespan of rattleSnake:" +rattleSnake.lifeSpan);
		System.out.println("length of the rattleSnake:" +rattleSnake.lengthInMeters);
	
	
	}
}