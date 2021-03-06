
//extends makes Car a child class of Machine, ie, it inherits from Machine
//therefore, Car now has all the methods in Machine class, and can be used on a Car object
//methods added to Car class, won't be avaible to Machine
public class Car extends Machine {
	//this method will override the start method in the Machine class, when called on
	//a Car object
	//public void start() {
		//System.out.println("Car started");
	//}
	
	//right click, source, Override/implement methods
		//@Override checks to make sure it is a method that exists in the parent class, Machine
		@Override
		public void start() {
			System.out.println("Car started");
		}
	
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
}
