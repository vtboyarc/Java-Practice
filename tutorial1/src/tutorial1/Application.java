package tutorial1;

public class Application {

	public static void main(String[] args) {
		// type sysout and then control+space, auto complete
		// command + d on a blank line removes that line
		String wat = "this is a variable  being printed out: ";
		Integer num = 10;
		boolean isItTrue = true;
		System.out.println("Java Udemy tutorial, first lesson!");
		if (isItTrue) {
			System.out.println("The boolean is set to true if you see this!");
		} else {
			System.out.println("I guess the boolean is set to false!");
		}
		System.out.println(wat + num);
		System.out.println(wat.length());
	}
}
