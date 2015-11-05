import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		// specificy in the carrots what type the array is
		// numbers is the name of this Array, can be whatever we want to
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// index 0
		numbers.add(10);

		// index 1
		numbers.add(100);

		// index 2
		numbers.add(40);

		// will print out 10, the value of index 0
		System.out.println(numbers.get(0));

		// Indexed for loop iteration
		// will print out index 0, then 1, then 2
		System.out.println("\nIteration #1: ");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// Removing items...need to be careful with this
		numbers.remove(numbers.size() - 1);

		// this is a slow way of doing it
		numbers.remove(0);

		// Iteration #2, does same thing as first way above
		//this one will be different tho, because we've removed 2 indexes in the code above
		System.out.println("\nIteration #2: ");
		for (Integer value : numbers) {
			System.out.println(value);
		}

	}
}
