import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int value = 0;
	
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		while(value != 10); {
			System.out.println("Got 10!");
		}
		
		int myNum = 0;
		while(myNum <100) {
			System.out.println(myNum);
		}
		
		for(int x = 0; x < 10; x++) {
			System.out.println(x);
			x++;
		}
		
		
	}
}
