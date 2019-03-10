package FibRecurions;

public class App {

        public static void main(String[] args) {
            // IntStream.rangeClosed(0, 100)
            // .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0
            // ? "Buzz" : i))
            // .forEach(System.out::println);

            System.out.println(Fib(6));

        }

    public static int Fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        else {
            return Fib(n-1) + Fib(n-2);
        }
    }

    }
