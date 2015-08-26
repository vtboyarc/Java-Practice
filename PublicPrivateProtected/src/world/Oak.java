package world;

public class Oak extends Plant {
	public Oak() {
		
		//Won't work - type is private in Plant class
		//type = "tree";
		
		//this works, because size is protected, and can be accessed within other classes
		//it isn't set to private
		this.size = "large";
	}
}
