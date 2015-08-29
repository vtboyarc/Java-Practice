class Machine {
	public void start() {
		System.out.println("Starting machine...");
	}
}

interface Plant {
	public void grow();
		
}

public class App {
	public static void main(String[] args) {
		
		//will run this sysout instead of the one above
		//it's effectively a child class of Machine
		Machine machine1 = new Machine() {
			@Override public void start() {
				System.out.println("Camera snapping...");
			}
		};
		
		machine1.start();
		
		// this creates an anonymous class from the interface Plant
		Plant plant1 = new Plant() {

			public void grow() {
				System.out.println("Plant growing...");
			}
		};
		// calling the method of the above anaonymous class
		plant1.grow();
	}
}
