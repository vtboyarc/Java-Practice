//a class is a blueprint for creating objects
class Person {
	// Classes can contain:
	
	//1. Data (describes state..instance variables, etc)
	//2. Subroutines (methods)
	
	//Instance variables (data or "state")
	String name;
	int age;
}

//only can have one public class in your file
public class App {
	//this is the main method
	public static void main(String[] args) {
		
		//declaring a var of type Person, from the above class
		//lets us refer to the instance variables, data, from the Person class
		Person person1 = new Person();
		
		person1.name = "Joe";
		person1.age = 37;
		
		Person person2 = new Person();
		
		person2.name = "Adam";
		person2.age = 26;
		
		System.out.println(person1.name);
	}
}
