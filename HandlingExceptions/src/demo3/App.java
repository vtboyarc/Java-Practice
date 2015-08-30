package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	public static void main(String[] args) {
		//calling the method created below
		try {
			openFile();
		} catch (FileNotFoundException e) {
			//it is better to do a custom message that is more clear than a stack trace
			// this is still a little to vague
			System.out.println("Could not open file");
		}
	}

	// just making a method in the App class
	public static void openFile() throws FileNotFoundException {
		File file = new File("test.txt");

		FileReader fr = new FileReader(file);
	}
}
