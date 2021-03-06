package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


//Try/catch method of handling exceptions
public class App {                        
	public static void main(String[] args) {

		//File is a Java class/object, comes with Java...like String
		File file = new File("test.txt");
		
		// Alternative to first way of handling exceptions.
		// tries the first line of code, if it throws exception, then go into catch block
		// any other lines in the try block will stop once one line throws exception
		try {
			FileReader fr = new FileReader(file);
			
			//This will not be executed, because first line will fail,
			//since we haven't add a test.txt file to the project
			System.out.println("Continuing...");
		} catch (FileNotFoundException e) {
			//this says print stack trace for the exception 
			//auto generated when you select catch/throw in quick fix
			//e.printStackTrace(); we can comment out, and do our own below
			//this won't print a stack trace, just the message File not found + name of file
			//it is better to do a custom message that is more clear than a stack trace
			System.out.println("File not found: " + file.toString());
		}
		//Once try/catch is done, moves on down the code and then hits this
		System.out.println("Finished");
	}
}
