
//key point: a class can implement multiple interfaces, but can only have one parent class, so
//it can only have one abstract class!
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Starting Car");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Turning off car");
		
	}

}
