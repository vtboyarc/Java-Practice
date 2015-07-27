import java.util.Scanner;

class Person {
	String name;
	int age;

}

public class App {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int age;

		do {
			System.out.println("What is your age?");

			age = scanner.nextInt();
		}

		while (age != 21);

		System.out.println("Sorry, you aren't old enough");

	}
}
