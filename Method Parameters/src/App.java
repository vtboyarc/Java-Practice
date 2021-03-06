class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	//when I call this method, it has to be in the order of String, then double
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " metres in direction " + direction);
		
	}
}

public class App {
	public static void main(String[] args) {
		Robot sam = new Robot();
		
		//if I want it to contain a string, then need a String var set about in the speak
		//method in the Robot class
		//we are actually passing this string to the method above, which then prints it
		sam.speak("Hi I'm sam");
		
		//we see that the jump method takes an int param, so we need to pass this an int
		sam.jump(5);
		
		//as seen in the move method, need to pass a String, then a double, in that order
		sam.move("West", 12.2);
		
		//this also works, since greeting is a var that contains a string
		//as long as what the type of var is, matches the parameter expected, it'll work
		String greeting = "Hello there";
		sam.speak(greeting);
		
		//same for this, value contains an int, so this works, since jump expects an int
		int value = 14;
		sam.jump(value);

	}
}
