
class Thing {
	
	//constants are final, can't be changed. As such, must set it to a value
	public final static int LUCKY_NUMBER = 7;
	
	public String name;
	
	//static variables belong to the class, and there is only one copy
	public static String description;
	
	//since static, anytime count is changed, changes all count objects instances
	public static int count = 0;
	
	//not static, so every object has it's own id variable
	public int id;
	
	//constructor, starts with class name
	//whenever new Thing(); is run in the code, whatever is in the constructor will run
	public Thing() {
		
		id = count;
		count++;
	}
	
	//this can also access the static data since it is in the class, I could print description
	public void showName() {
		System.out.println("Object id " + id + "," + description + ": " + name);
	}
	
	public static void showInfo() {
		System.out.println("Hello");
	}
}

public class App {
	public static void main(String[] args) {
		
		//you have to call static vars by the class name
		Thing.description = "I am a thing";
		
		System.out.println(Thing.description);
		
		//how you call a static method, have to use class name
		Thing.showInfo();
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		//constructor is run twice one the two above lines are run, so count has been incremented
		//because that is what we have happen in the constructor
		System.out.println("After creating objects, count is: " + Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		//calls the showName method, which prints the name
		thing1.showName();
		thing2.showName();
		
		//PI is a constant, can't be changed. I can't set it to = something else
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		
	}
}
