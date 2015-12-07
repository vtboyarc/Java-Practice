import java.util.Iterator;
import java.util.LinkedList;

public class App {
	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();

		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		Iterator<String> it = animals.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			
			//can remove items from the list
			if (value.equals("cat")) {
				it.remove();
			}

			System.out.println();

			// modern java iteration style, this prints out everything in
			// animals
			for (String animal : animals) {
				System.out.println(animal);
			}
		}
	}
}
