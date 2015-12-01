import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	
	//right click > source > generate hash code and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	//sorts by length of characters
	@Override
	public int compareTo(Person person) {
		int len1 = name.length();
		int len2 = person.name.length();
		
		if(len1 > len2) {
			return 1;
		}
		else if(len1 < len2) {
			return -1;
		}
		//if they're equal in length, this will put them in alphabetical order
		else {
			return name.compareTo(person.name);
		}
	}
}

public class App {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		//tree sets store their elements in natural order
		SortedSet<Person> set = new TreeSet<Person>();
		
		//calling the methods we made below
		addElements(list);
		addElements(set);
		
		//sorts the list array
		Collections.sort(list);
		
		showElements(list);
		//adding a blank line here to separate for clarity
		System.out.println();
		showElements(set);
		
	}
	
	//a method to add elements to the above Arrays
	private static void addElements(Collection<Person> col) {
		col.add(new Person ("Joe"));
		col.add(new Person ("Sue"));
		col.add(new Person ("Juliet"));
		col.add(new Person ("Clare"));
		col.add(new Person ("Mike"));
	}
	
	//a method to show the elements that were added in the method above
	private static void showElements(Collection<Person> col) {
		//element: col is same as saying element in col
		for(Person element: col) {
			System.out.println(element);
		}
	}
}
