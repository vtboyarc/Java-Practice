import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {
		
		//it might do the order they are added, but might be mixed up
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		//keys and values will stay in same order they are added, unlike the above HashMap
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		//TreeMap sorts the values you add to it, in natural order (low to high, alphabetical,
		//based on what your keys are)
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		
		
		//calling the method we made below, and we can pass as a parameter, anyone of the
		//above Maps, by putting it's variable name in the parameter
		//notice how the differnt maps print out differently when you run the program
		testMap(treeMap);
	}
	
	//Method to demonstrate the difference between the above 3 maps
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		
		//making an Integer called key that gets the keys in the maps
		for(Integer key: map.keySet()) {
			//values are Strings, so we name that value here, and we
			//pass it the key variable we set above in the for loop
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}
	
}
