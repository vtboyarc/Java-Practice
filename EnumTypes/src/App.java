
public class App {
	public static void main(String[] args) {
		
		//from the enum class we created, Animal.java
		// this will print out the sysout in case CAT
		Animal animal = Animal.CAT;
		
		//just start with switch(animal) and brackets, click yellow warning,
		//double click add missing case statements
		//we add in the sysouts on our own
		switch(animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		
		}
		//way to see what class an object belongs to
		System.out.println(Animal.DOG.getClass());
		
		//from the getName method in the Animal enum class, it returns name
		System.out.println(Animal.MOUSE.getName());
		
		//will print out from the toString method in the Animal enum class
		System.out.println(Animal.DOG);
		
		//overrides the toString method in the Animal enum class
		System.out.println("Enum name as a string: " + Animal.DOG.name());
		
		Animal animal2 = Animal.valueOf("CAT");
		
		System.out.println(animal2);
	}
}
