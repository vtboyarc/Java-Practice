
public class Machine {
	
	//since private, can't be accessed by Car class, even tho it extends Machine
	//can only be accessed within the Machine class
	private String name = "Machine Type 1";
	
	public void start() {
		System.out.println("Machine started");
	}
	
	public void stop() {
		System.out.println("Machine stopped");
	}
	
	
}
