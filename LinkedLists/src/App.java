import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class App {
	public static void main(String[] args) {
		//if you onle want to add or remove items at end of the list, use ArrayList
	List<Integer> arrayList = new ArrayList<Integer>();
	
	//if you want to add or remove items from anywhere, beginning, middle, use LinkedList
	List<Integer> linkedList = new LinkedList<Integer>();
	
	doTimings("ArrayList", arrayList);
	doTimings("LinkedList", linkedList);
	
	}
	
	private static void doTimings(String type, List<Integer> list) {
		
		long start = System.currentTimeMillis();

		//Add items at end of list
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		
				
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
}
