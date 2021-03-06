public class App {

	public static void main(String[] args) {

		//once you've created a string, cna't every change it, immutable. 
		//this all gets added to the info var as one String
		//this is a bad way to do it, inefficient
		String info = "";
		info += "My name is Adam";
		info += " ";
		info += "I am a builder";
		
		System.out.println(info);
		
		//do it this way instead, using StringBuilder. More memory efficient
		StringBuilder sb = new StringBuilder();
		
		//append just modifies sb
		sb.append("My name is Adam");
		sb.append(" ");
		sb.append("I am a robot");
		//prints out the above
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		//you can chain them, like so
		s.append("My name is Rob")
		.append(" ")
		.append("I am another robot");
		
		System.out.println(s.toString());
		
		//String buffer is a thread safe version of string builder, safe for multiple threads
		
		//Formatting Strings
		
		System.out.println("Here is some text.\tThat was a tab.\nThat was a newline");
		
		//print format, allows you to use other formats
		//puts 5 in place of %d
		System.out.printf("Total cost %d", 5);
		//puts the first %d 10 characters wide
		System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);
		
		//puts i in place of %d, and iterates through until gets to 20
		// %s would insert a String
		for(int i =0; i<20; i++) {
			System.out.printf("%-2d: some text\n", i);
		}
		
		//%f for floating point values
		//%.2f says go out to 2 decimal places (and it will round it!)
		System.out.printf("Total value: %.2f\n", 5.6874);
		
		//does 5 characters max, and one decimal place max
		System.out.printf("Total value: %5.1f\n", 343.23423);
	}

}
