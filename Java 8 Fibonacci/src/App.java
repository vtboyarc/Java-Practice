public class App {

	public static void main(String[] args) {
		System.out.println(Fib(5));

	}

	// returns the next number in the Fibonacci sequence
	public static int Fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {
			return Fib(n - 1) + Fib(n - 2);
		}
	}

}