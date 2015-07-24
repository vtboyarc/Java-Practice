public class App {
	public static void main(String[] args) {
		//makes an array and gives it memory for 3 string objects
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"Apple", "banana", "pear", "kiwi"};
		
		//sets a string variable named fruit, and it iterates through each item in the fruits array
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		//lower case, it is a primitive, not a class like String
		int value = 0;
		
		//null is default value for object references
		String text = null;
		
		String[] texts = new String[2];
		
		//by default, will be set to null if you don't put anything in the array
		System.out.println(texts[0]);
		
		//now we are putting string 'one' inside of of the first spot in the array
		texts[0] = "one";
	}
}
