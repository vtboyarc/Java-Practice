class Plant {
	
	public static final int ID = 7; //constant, can't be changed, final
	private String name;
	
	//keep private what you can. this method is public, but the method is returns is private
	public String getData() {
		String data = "Some stuff" + calculateGrowthForecast();
		
		return data;
	}
	
	private int calculateGrowthForecast() {
		return 9;
	}

	//for easy creation of setters and getters, right click, choose source, 
	//generate getters and setters, and then choose the variable you want them for
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class App {
	public static void main(String[] args) {
		
	}
}
