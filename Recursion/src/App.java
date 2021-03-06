
public class App {
	public static void main(String[] args) {
		
		//E.g factorial of 4 = 4 * 3 *2 * 1
		//can use recursion to get factorials of numbers
		
		//any number we pass in here, we will get the factorial of, based on the code below
		System.out.println(factorial(2));
	}
	
	private static int factorial(int value) {
		
		//System.out.println(value);
		
		//calling a method in itself can result in stack overflow
		//so have to be careful with recursion, need to stop it
		
		if(value == 1) {
			return 1;
		}
		//until value =1, will do this line
		return factorial(value -1) * value;
		
	}
}
