public class Application {
	public static void main(String[] args) {
		
		int myInt = 15;
		
		if(myInt < 10) { //if this first condition is true, it won't continue to go down the code, stops here
			System.out.println("Yes, it's true!");
		}
		else if(myInt > 20) {
			System.out.println("No, it's false");
		}
		else {
			System.out.println("None of the above");
		}
		
	}
}
