/*When you make a class a child of an abstract class, you are making a strong statement about what
that class is
an interface can be more vague, for example, have ID's in it, use it for people, cars, etc
abstract, like this example, is all about machines..cars, camera, etc. More specific 

key point: a class can implement multiple interfaces, but can only have one parent class, so
it can only have one abstract class!

Also, you can't have code inside methods in an interface, but you can in an abstract class.
In an interface, you leave the code implementation completely up to the child class

Look at the Machine.java class for example of an abstract class
*/

public class App {
	public static void main(String[] args) {
		
		//we can do all this on these objects, because Machine has these setters set up
		//and the camera and car classes extends machine
		Camera cam1 = new Camera();
		
		cam1.setID(5);
		
		Car car1 = new Car();
		
		car1.setID(4);
		
		//runs all the methods in the run method, in the Machine class
		car1.run();
	
	}
}
