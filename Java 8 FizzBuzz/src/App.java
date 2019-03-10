import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		// Java streams, range 0-100 print out fizz for number / 3, buzz for / 5,
		// fizzbuzz for both 3 & 5
		IntStream.rangeClosed(0, 100)
				.mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
				.forEach(System.out::println);

	}

}
