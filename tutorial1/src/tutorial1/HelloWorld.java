package tutorial1;

public class HelloWorld {

	public static void main(String[] args) {
		//sysout then hit ctrl+space to auto complete
		//ctrl + d deletes a line
		System.out.println("Hello World!");
		//an int variable called myNumber, and initializes the variable
		int myNumber = 88;
		long myLong = 10000; //can be up to a 64 bit number
		double myDouble = 7.3243; //for precision
		float myFloat = 324.3f; //you need to add an 'f' to the end of floats
		char myChar = 'y'; //can be any single character on your keyboard
		boolean myBool = true; //true or false
		byte myByte = 127; //holds only up to 8 bits
		
		
		System.out.println(myNumber);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBool);
		System.out.println(myByte);
	}

}
