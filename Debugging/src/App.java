
public class App {
	public static void main(String[] args) {
		
		//from the class "Test" I made
		Test test1 = new Test();
		
		int value = test1.getInitialValue();
		
		//doStuff is method I made in the test class
		test1.doStuff(value);
		
		System.out.println("Starting");
		
		System.out.println("Incrementing value");
		
		value++;
		
		value = value - 8;
		
		System.out.println(value);
		
		System.out.println("Finishing");
	}
	
}
