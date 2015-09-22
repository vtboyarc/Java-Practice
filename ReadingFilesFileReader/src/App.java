import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class App {
	public static void main(String[] args) {
		
		//created a text file, right click on project, new, file 
		File file = new File("test.txt");
		
		BufferedReader  br = null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			//we are creating this as a reference to point to each line in the file
			String line;
			
			//buffered reader go through each line, so setting String Line to this,
			//allows us to print out lines of the file by using the line variable
			
			//until no more lines, print out next line
			//so, this prints out all the lines in the file
			while(  (line = br.readLine()) != null ) {
				System.out.println(line);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
		//this will always be executed no matter
		finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Unable to close file: " + file.toString());
			}
			catch(NullPointerException ex) {
				// File was probably never opened, don't really need to say anything in here
				//simply handles npe
			}
		}
		
		
	}
	
}
