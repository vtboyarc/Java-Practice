import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		num = input.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("The number is divisible by both 3 and 5");
		}
		if (num % 3 == 0 && num % 5 != 0) {
			System.out.println("The number is divisible by 3");
		}
		if (num % 5 == 0 && num % 3 != 0) {
			System.out.println("The number is divisble by 5");
		} else if (num % 5 != 0 && num % 3 != 0) {
			System.out.println("The number is not divisible by 3 or 5");
		}

	}
}
