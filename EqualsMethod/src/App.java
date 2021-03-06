class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//Right click, source, generate haschode and equals, to get this
	//it tries to compare two object efficiently 
	//basically, doing, is this object equal to x object
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}

public class App {
	public static void main(String[] args) {

		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");
		
		
		
		System.out.println(person1.equals(person2));
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		//false, Doubles are harder to compare, unless you use .equals
		System.out.println(value1 == value2);
		//will show true
		System.out.println(value1.equals(value2));
		
		int number1 = 6;
		int number2 = 6;
		
		//true
		System.out.println(number1 == number2);
		
		String text1 = "hello";
		String text2 = "hello";
		
		System.out.println(text1 == text2);
	}
}
