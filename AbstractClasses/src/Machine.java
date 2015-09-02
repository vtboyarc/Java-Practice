
/*
 * If we only want this to be a class to set up variables and setters/getters for other 
 * classes, and want to keep other people from instantiating Machine in the main app,
 * ie, Machine mach1 = new Machine();, we make this an abstract class
 */
public abstract class Machine {
	/*
	 * Camera and Car classes can both have ID's, so create it here
	 * since both those classes extend Machine.
	 * after you create the ID int, right click, source, generate getters and setters for ID
	 * Now, every class that extends Machine, has these available to it
	 */
	private int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	/*
	 * If we want to force all machines, ie classes that extends machine, to have certain
	 * methods, we can do that in an abstract class
	 * essentially like creating a method in an interface
	 * but now, we will have to implement this method in the classes that extend Machine
	 */
	
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutdown();
	
	//so this run method, will basically run all the methods in it, only have to call the
	//run method
	// We will NOT be forced to use this method inside the classes that extend Machine.
	public void run() {
		start();
		doStuff();
		shutdown();
	}
}
