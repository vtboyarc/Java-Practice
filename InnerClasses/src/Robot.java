
public class Robot {

	//instance data (all Robot objects will have an int id)
	private int id;
	
	//inner class. This class will now have access to the instance data of the Robot class
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking");
		}
		
	}
	
	//static, so won't be able to access Robot instance variables 
	//used when you want a normal class that isn't associated with the outer class,
	//but you want to group it with it
	static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robert";
		
		//you can even create a class inside a method
		class Temp {
			public void doSomething() {
				System.out.println("Id is " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}

}
