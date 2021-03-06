import java.io.FileNotFoundException;
import java.io.IOException;


public class App {
	public static void main(String[] args)  {
		//from the Test class
		Test test = new Test();
		/*
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't pass");
		}
		*/
		
		/* Java 7 way: click error, surround with try/multi-catch
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//You have to handle the child exception before the parent!! So FileNotFoundException first
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
