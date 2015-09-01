//two basic kinds of exceptions in Java:
// Runtime and Checked
public class App {
	public static void main(String[] args) {
		
		/*Checked exceptions, you are forced to handle
		try {
			Thread.sleep(111);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//Unchecked exceptions, also known as runtime exceptions, you aren't forced to handle
		int value = 7;
		//this will throw an exception, but does so on it's own. This is an example of
		//a runtime exception 
		//runtime exceptions are very basic, fundamental exceptions, if your program throws it,
		//it means something is obviously seriously wrong with your code
		value = value/0;
		
		String text = null;
		//another runtime exception
		System.out.println(text.length());
		
		String[] texts = {"one", "two", "three"};
		
		//there is no index 3, but doesn't force us to handle exception
		//because it is such a fundamental error, it is a runtime error
		//it will throw an exception for us when we run it
		System.out.println(texts[3]);

	}
}
