package demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Throws exception method of handling exceptions 

public class App {                         //this was added by clicking on the error message
	                                     //needed for stack trace error, if it can't find file
	public static void main(String[] args) throws FileNotFoundException {

		//File is a Java class/object, comes with Java...like String
		File file = new File("test.txt");
		
		// Another built in Java class
		FileReader fr = new FileReader(file);
	}
}
