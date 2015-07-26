public class App {
	public static void main(String[] args) {

		int[] values;
		values = new int[3]; // says, allocate memory to the values array, to be
								// able to hold 3 integers

		System.out.println(values[0]);

		values[0] = 10;
		values[1] = 20;
		values[2] = 50;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		for (int i = 0; i < values.length; i++) { // increments through the
													// items in the value array
													// until hits the amount of
													// items in the array
			System.out.println(values[i]);
		}
		
		//you can create new array and initialize it with values at the same time on one line
		int[] numbers = {5, 6, 7};
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
