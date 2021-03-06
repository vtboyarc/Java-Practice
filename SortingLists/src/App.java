import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//shortcut: right click, source > generate getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id + ": " + name;
	}
	
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2) {
			return 1;
		}
		//return a negative for less than
		else if(len1 < len2) {
			return -1;
		}
		return 0;
	}
	
}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		//just add a negative sign to s1, ie -s1.compare etc, for reverse alphabetical order
		return s1.compareTo(s2);

	}
	
}

public class App {
	
	

	public static void main(String[] args) {
		
	/////// Sorting Strings ////////////
		List<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("elephant");
		
		//sorts the array in order of string length
		//uncomment this line and comment out the alpha one, to sort by string length
		//Collections.sort(animals, new StringLengthComparator());
		
		//sorts by alphabetical order
		Collections.sort(animals, new AlphabeticalComparator());
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
	/////// Sorting Numbers ////////////
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);
		
		//will sort by numerical order
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				//add -num1 instead for reverse numerical order
				return num1.compareTo(num2);
			}
			
		});
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
	/////// Sorting Arbitrary Objects ////////////
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(2, "Sue"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(4, "Clare"));
		
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				
				if(p1.getId() > p2.getId()) {
					return 1;
				}
				else if(p1.getId() < p2.getId()) {
					return -1;
				}
				return 0;
			}
			
		});
		
		for(Person person: people) {
			System.out.println(person);
		}
	}
}
