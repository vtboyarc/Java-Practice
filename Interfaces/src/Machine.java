
//implements is for using an Interface, in this case, the Info interface
//will give an error, click on it, need to Add unimplemented methods
//this forces you to have all the methods that were named in the interface
public class Machine implements Info {
	
	private int id = 7;

	public void start() {
		System.out.println("Machine started");
	}

	//@Override don't really need this
	public void showInfo() {
		System.out.println("Machine ID is: " + id);
	}
}
