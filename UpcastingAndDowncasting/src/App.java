class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}
	
class Camera extends Machine {
		public void start() {
			System.out.println("Camera started");
		}
		
		public void snap() {
			System.out.println("photo taken");
		}
	}
	


public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// Upcasting - safe, guarenteed from polymorphism
		//taken a variable of type Camera, and made it a Machine
		//it went 'up' the class hierarchy from camera to machine, machine2
		Machine machine2 = camera1;
		machine2.start(); //will now do the method in the camera 
		//machine2.snap(); won't work: method named snap isn't in Machine class
		
		// Downcasting - not safe
		//this works, because downcasting to new Camera
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.snap();
		camera2.start();
		
		// Doesn't work -- runtime error
		//won't work, because machine has not been set to a new Camera
		//Machine machine4 = new Machine();
		//Camera camera3 = (Camera)machine4;
		//camera3.start();
		
	}
}
