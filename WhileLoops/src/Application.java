public class Application {
	public static void main(String[] args) {
		int value = 0;

		// as long as what is in here is true, the loop will run
		while (value < 10) {
			System.out.println("Hello " + value); // added 'value' to see the output iteration

			value = value + 1; // once value =10, the loop will stop
		}
	}
}
