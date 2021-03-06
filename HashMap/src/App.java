import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {

		// maps store pairs of keys and values
		// you need to specify what kinds of objects you want to store in it
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// puts these into the Map
		//for the first one, 5 is the key, "Five" is the value
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(3, "Three");
		map.put(1, "One");
		
		//the second time you use the same key, overrides the first
		map.put(5, "What will happen with the same key twice?");

		String text = map.get(6);
		
		System.out.println(text);
		
		//this loop prints out all the keys and their values
		//HashMaps are not sorted....might print different order each time
		//sorted maps keep order
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
	}
}
