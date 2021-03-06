class Machine {
	private String name;
	private int code;
	
	//constructors don't have a return type
	//constructors have to have the same name as your class
	//you can have multiple constructors with the same method name, as long as
	//the parameters being passed in are different
	//constructors runs every time an object is created, as in machine1 below
	public Machine() {
		//when calling another constructor, needs to be first line of code
		this("Arnie", 0); //versus commented out line. This is calling the constructor that
		//takes a String and int parameter, in this case the one we made at the bottom
		System.out.println("Constructor running");
		
		//name = "Arnie";
		
	}
	public Machine(String name) {
		System.out.println("Second constructor running");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}
	
}

public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		
		//can also do this to invoke constructors, does same thing as above code
		//new Machine();
		
		Machine machine2 = new Machine("Bertie");
		
		Machine machine3 = new Machine("Chalky", 7);
	}
}
