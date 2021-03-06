import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class App {
	public static void main(String[] args) throws FileNotFoundException {
		//made a text file on desktop, added some text, and named it example.txt
		//String fileName = "/Users/adamcarter/Desktop/example.txt";
		//you can do the below instead, if you add the text file to the project in eclipse
		String fileName = "example.txt";
		
		File textFile = new File(fileName);
		
		//click error icon, select 'add throws declaration'
		Scanner in = new Scanner(textFile);
		
		//loop that goes through and reads each line in the file
		int count = 2; //this is just for the bottom sysout, shows line number in file
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(line);
			
			System.out.println(count + ": " + line);
			count++;
		}
		
		in.close();
	}
}
