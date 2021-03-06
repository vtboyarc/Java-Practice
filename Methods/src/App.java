//a class is a blueprint for creating objects
class Person {
	// Classes can contain:
	
	//1. Data (describes state..instance variables, etc)
	//2. Subroutines (methods)
	
	//Instance variables (data or "state")
	String name;
	int age;
	int dob;
	
	//methods start lower case
	//you have to call the method somewhere to make it run
	void speak() {
		//you don't need the for loop, just an example of what you can add to a method
		for(int i=0; i<3; i++) {
			System.out.println("My name is: " + name + " and I am " + age + " years old");
		}
	}
	
	//another method we added to the Person class
	void sayHello() {
		System.out.println("Hello there");
	}
}

//only can have one public class in your file
public class App {
	//this is the main method
	public static void main(String[] args) {
		
		//declaring a var of type Person, from the above class
		//lets us refer to the instance variables, data, from the Person class
		Person person1 = new Person();
		
		person1.name = "Joe";
		person1.age = 16;
		//calling the speak method from the Person class
		person1.speak();
		person1.sayHello();
		
		Person person2 = new Person();
		
		person2.name = "Adam";
		person2.age = 26;
		person2.speak();
		person2.sayHello();
		
		System.out.println(person1.name);
	}
}