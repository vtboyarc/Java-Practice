import world.Plant;

/*
 * private -- only within same class
 * public - from anywhere
 * protected - same class, subclass, and same package
 * no modifier - same package only, any class in the same package
 */

public class App {
	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		//won't work, type is private in the Plant class
		//System.out.println(plant.type);
		
		//size is protected, and App is not in same package as Plant
		//so this won't work
		//so private only works within the class of the variable,
		//public works anywhere,
		//and protected works in any class within the same package
		//System.out.println(plant.size);
	}
}
