package world;

public class Plant {
	//this is bad practice, having it public. Should encapsulate, hide away
	public String name;
	
	//Acceptable practice, as long as the public is a final and can't be changed
	//it is a constant
	public final static int ID = 8;
	
	//only can be access within this class
	private String type;
	
	protected String size;
	
	//can be accessed in same class, and package, if you don't specify protected, public, etc
	int height;
	
	public Plant() {
		name = "Freddy";
		
		type = "plant";
		
		size = "medium";
	}
}
