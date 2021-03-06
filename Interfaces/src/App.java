
public class App {
	public static void main(String[] args) {

		Machine mach1 = new Machine();
		mach1.start();
		
		//we can pass in Bob because we have the constructor set to take a string param
		//in the Person class
		Person person1 = new Person("Bob");
		person1.greet();
		
		//can't use an Interface with the 'new' keyword, because has to be followed by class name
		
		//since Machine implements Info, I can do this
		//the only methods you can call on info1, are whatever is in Info interface,
		//and have the code in the Machine class, in those methods from the interface
		Info info1 = new Machine();
		info1.showInfo();
		
		//person1 is an object already created above
		Info info2 = person1;
		info2.showInfo();
		
		//this calls the method below, outputInfo, on mach1 and person1
		//which calls the showInfo method, from the Interface, 
		//and is implemented with code in Machine and Person classes
		outputInfo(mach1);
		outputInfo(person1);
	}
	
	//has to be static since there is no App object created
	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
