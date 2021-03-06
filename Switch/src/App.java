import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "start": // it checks for string 'start' as the value of text, if so, it does the next line
			System.out.println("Machine started!");
			break;

		case "stop":
			System.out.println("Machine stopped");
			break;

		// default has to go at the bottom. It will be what is run if not any of the other cases
		default:
			System.out.println("Command not recognized");
		}
		
		
	}
}
