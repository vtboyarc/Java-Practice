
public class Test {

	//need to have a method to use the "step into" button in debugging
	//step return gets you out of the method you stepped into, and back to where 
	//you left off where you were at in debugging 
	public int getInitialValue() {
		
		int number = 5;

		number += 4;

		return number;
	}
	
	public void doStuff(int number) {
		number = number - 6;
		
		System.out.println(number);
	}
}
