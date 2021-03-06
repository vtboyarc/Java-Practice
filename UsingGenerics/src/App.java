import java.util.ArrayList;
import java.util.HashMap;


class Animal {
	
}

public class App {
	public static void main(String[] args) {
		
		//ArrayList allows you to not have to worry about the size of the array
		// Before Java 5:
		ArrayList list = new ArrayList();
		
		list.add("APple");
		list.add("Orange");
		list.add("Banana");
		
		//will print out banana
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		// Modern Java style
		//inside the carrots, you put what you want in the Array
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("aligator");
		
		//don't need to cast to String as in the old style, since we specified above
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		
		// There can be more than one type argument
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Java 7 style
		//It will infer what type to use, don't have to fill in other side of carrots 
		ArrayList<Animal> someList = new ArrayList<>();
		
	}
}
