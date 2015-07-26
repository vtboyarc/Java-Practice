class Person {
	String name;
	int age;
	
	//void methods don't return anything inside the method
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	//this method is an int, and can return something
	int caclulateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		//when the code hits return, it ends the method
		return yearsLeft;
	}
	
	//getAge method, all it is doing is returning the age variable
	int getAge() {
		return age;
	}
	
	//so this and getAge are getter methods
	String getName() {
		return name;
	}
}

public class App {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name = "Adam";
		person1.age = 26;
		
		
		//setting int years equal to the return of the calcualteYearsToRetirement
		// method
		int years = person1.caclulateYearsToRetirement();
		
		//now we don't have to have the entire method name in the print statement,
		//just the years variable
		System.out.println("Years left to retire: " + years);
		
		int age = person1.getAge(); //from the method in Person class
		String name = person1.getName(); //from the getName method in Person class
		
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);

	}
}
