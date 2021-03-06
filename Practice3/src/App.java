class Robot {
	String name;
	int age;
	String type;
	public static int numberOfRobots =1;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public void speak(String text) {
		System.out.println(text);
	}
	
	public Robot() {
		System.out.println("Number of robots is: " + numberOfRobots);
		numberOfRobots++;
	}
}

public class App {
	public static void main(String[] args) {
		
		Robot robot1 = new Robot();
		robot1.setName("Roomba");
		robot1.setAge(280);
		robot1.setType("Household");
		System.out.println("I am the first robot. My name is: " + robot1.name);
		System.out.println("My age is " + robot1.age);
		System.out.println("And my type is: " + robot1.type);
		robot1.speak("wat");
		Robot robot2 = new Robot();
		robot2.speak("I am the second robot");
		
	}
}
