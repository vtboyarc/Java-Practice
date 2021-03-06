class Frog {
	String name;
	int age;
	String type;
	
	//public void setName(String newName) {
		//name = newName;
	//}
	//this setName is a different way of doing the above commented out
	public void setName(String name) {
		//this.name refers to the String name var, and name refers to the String name
		//in the method above as a parameter
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	
	//these two methods simply get and return the value of the 2 above variables 
	//don't need 'this' in here, because there's no parameter being passed in, no conflicts
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
}

public class App {
	public static void main(String[] args) {

		Frog frog1 = new Frog();
		
		//frog1.name = "Bertie";
		//frog1.age = 1;
		
		//instead of the above 2 lines, setters let us to do this:
		//this calls the set name method, which takes a String as a parameter
		frog1.setName("Bertie");
		frog1.setAge(1);
		frog1.setType("huge robot");
		System.out.println(frog1.age);
		System.out.println(frog1.type);
		
		
		
		
		
	}
}
