import java.util.Scanner;


public class Application {
	public static void main(String[] args) {
		// Create scanner object
		//input can be whatever I want to call the variable
		//control + shift + o adds all necessary imports
		Scanner input = new Scanner(System.in); //creates new scanner object, passes input stream object
		// Output prompt
		System.out.println("Enter a line of text");
		//Wait for the user to enter a line of text
		//int value = input.nextInt(); can do ints, floating points (double) etc
		String line = input.nextLine();
		
		//Tell them what they entered
		System.out.println("You entered: "+ line);
	}
}
