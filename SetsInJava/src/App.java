import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {

		// HashSet does not retain order, might change order each time you run
		// it
		Set<String> set1 = new HashSet<String>();

		// LinkedHashSet remembers the order you added items in
		Set<String> set2 = new LinkedHashSet<String>();

		// TreeSet sorts in natural order, ie aplhabetical, etc
		// useful if you want to sort a large list in alpahbetical or numerical
		Set<String> set3 = new TreeSet<String>();

		// Will print this first, because nothing has been added yet when this
		// code is run
		if (set1.isEmpty()) {
			System.out.println("Set is empty");
		}

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		// won't print, because set1 is no longer empty
		if (set1.isEmpty()) {
			System.out.println("Set is not empty");
		}

		set2.add("dog");
		set2.add("cat");
		set2.add("mouse");
		set2.add("snake");
		set2.add("bear");

		set3.add("dog");
		set3.add("cat");
		set3.add("mouse");
		set3.add("snake");
		set3.add("bear");

		// adding a duplicate item does nothing
		// sets only contain unique items
		// useful if you want to sort out duplicates
		set1.add("mouse");

		System.out.println(set1);

		System.out.println(set2);

		System.out.println(set3);

		// Iteration
		for (String element : set1) {
			System.out.println(element);
		}

		// Does set contain a given item?
		if (set1.contains("advark")) {
			System.out.println("Contains ardvark");
		}

		if (set1.contains("cat")) {
			System.out.println("Contains cat");
		}

		// Intersection -  find which elements are in set1, that are in set4

		Set<String> set4 = new TreeSet<String>();

		//contains 2 elements from the other sets, but 3 new ones
		set4.add("dog");
		set4.add("cat");
		set4.add("giraffe");
		set4.add("monkey");
		set4.add("ant");
		
		//makes intersection a copy of set1
		Set<String> intersection = new HashSet<String>(set1);
		
		//keeps only the elements in intersection(set1) that are also in set4
		intersection.retainAll(set4);
		
		//prints cat, dog, because those are the common elements between the 2 sets
		System.out.println(intersection);
		
		//Difference - find elements in set1, that are not in set4
		Set<String> difference = new HashSet<String>(set1);
		
		//removes all elements in set4 that aren't in set2
		difference.removeAll(set4);
		
		//prints elements in set1 that aren't in set4
		System.out.println(difference);

	}
}
