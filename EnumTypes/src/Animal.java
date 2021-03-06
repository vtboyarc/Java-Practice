//right click on project, new > enum

public enum Animal {
	//cat, dog, and mouse, are now objects of type Animal
	//CAT, DOG, MOUSE;
	
	//with the constructor below, we now have to give each of these objects a string param
	CAT("Toby"), DOG("Laddie"), MOUSE("Jerry");
	
	private String name;
	
	 Animal(String name) {
		 this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "This animal is called: " + name;
	}
	 
	 
}
