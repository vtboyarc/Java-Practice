import java.util.Scanner;

class Person {
	String name;
	int age;
	
	public void speak() {
		System.out.println("My name is " + name);
	}
}

public class App {
	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "wat";
		words[1] = "huh";
		words[2] = "helloo";
		
		System.out.println(words[1]);
		
		
		int myInt = 31;
		
		if(myInt < 30) {
			System.out.println("Number is smaller than 30!");
		}
		else {
			System.out.println("Number is bigger than 30");
		}
		
		for(int x=0; x < 50; x++) {
			System.out.println(x);
		}
		
		int num = 0;
		
		while(num < 10) {
			System.out.println("Number is: " + num);
			num++;
		}
		
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		
		//this does: while value is not 5, it asks for a number. Once it is =5, it leaves the while,
		//and prints out wat
		do {
			System.out.println("Enter a number");
			value = scanner.nextInt();
		}
		
		while(value != 5);
		System.out.println("wat");
		
		Person person1 = new Person();
		
		person1.name = "Adam";
		person1.speak();
		
		
	}
}
